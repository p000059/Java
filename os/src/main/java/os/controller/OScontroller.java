package os.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import os.model.OS;
import os.service.OSservice;

@RequestMapping(value = "/")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class OScontroller {

	@Autowired
	private OSservice oSservice;
	
	@ResponseBody
	@PostMapping(value = "insertOS")
	public OS insert(@RequestBody OS objectOS) {
		
		return this.oSservice.create(objectOS);
	}
	
	@ResponseBody
	@PutMapping(value = "updateOS")
	public OS update(@RequestBody OS objectOS) {
		
		return this.oSservice.update(objectOS);
	}
	
	@ResponseBody
	@GetMapping(value = "readOS")
	public OS read(@RequestParam String code) {
		
		return this.oSservice.read(code);
	}
	
	@ResponseBody
	@GetMapping(value = "readallOS")
	public List<OS> readAll(){
		
		return this.oSservice.readOSList();
	}
	
	@ResponseBody
	@GetMapping(value = "readpagedOS")
	public Page<OS> readPagedOS(@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable pageable){
		
		return this.oSservice.readOSLists(pageable);
	}
	
	@ResponseBody
	@DeleteMapping(value = "deleteOS")
	public OS delete(@RequestBody OS objectOS) {
		
		return this.oSservice.delete(objectOS);
	}
	
	@ResponseBody
	@DeleteMapping(value = "deleteOScode")
	public OS delete(@RequestParam String code) {
		
		return this.oSservice.delete(code);
	}
}
