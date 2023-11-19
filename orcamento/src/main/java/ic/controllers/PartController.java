package ic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ic.interfaces.controller.IpartController;
import ic.interfaces.validations.IpartValidation;
import ic.model.DTO.PartDTO;
import ic.model.entity.Part;

@RequestMapping(value = "/")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class PartController implements IpartController {
	
	@Autowired
	private IpartValidation ipartValidation;

	@Override
	@ResponseBody
	@PostMapping(value = "insertpart")
	public ResponseEntity<Part> insert(@RequestBody PartDTO partDTO) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(this.ipartValidation.insert(partDTO));
	}

	@Override
	@ResponseBody
	@PutMapping(value = "updatepart")
	public ResponseEntity<Part> update(@RequestBody Part part) {

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.ipartValidation.update(part));
	}

	@Override
	@ResponseBody
	@GetMapping(value = "listparts")
	public ResponseEntity<List<Part>> listParts(){
		
		return ResponseEntity.status(HttpStatus.OK).body(this.ipartValidation.listParts());
	}

	@Override
	@ResponseBody
	@DeleteMapping(value = "deletepart")
	public ResponseEntity<Part> deletePart(@RequestBody Part part) {
		
		return ResponseEntity.status(HttpStatus.GONE).body(this.ipartValidation.delete(part));
	}
}
