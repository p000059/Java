package ic.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
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

import ic.interfaces.controller.ItaxController;
import ic.interfaces.service.ItaxService;
import ic.interfaces.validation.ItaxValidation;
import ic.model.dto.TaxDTO;
import ic.model.entity.Tax;

@RequestMapping(value = "/")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class TaxController implements ItaxController {

	@Autowired
	private ItaxService itaxService;
	
	@Autowired
	private ItaxValidation itaxValidation;

	private Tax convertDTO(TaxDTO taxDTO) {
		
		Tax objectTax = new Tax();
		
		BeanUtils.copyProperties(taxDTO, objectTax);
		
		return objectTax;
	}
	
	@Override
	@PostMapping(value = "inserttax")
	@ResponseBody
	public ResponseEntity<Tax> insertTax(@RequestBody TaxDTO taxDTO) {

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.itaxValidation.insertion(taxDTO));
	}

	@Override
	@GetMapping(value = "listtax")
	@ResponseBody
	public ResponseEntity<List<Tax>> listTax() {

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.itaxService.listTax());
	}

	@Override
	@PutMapping(value = "updatetax")
	@ResponseBody
	public ResponseEntity<Tax> updateTax(@RequestBody TaxDTO taxDTO) {
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.itaxService.updateTax(this.convertDTO(taxDTO)));
	}

	@Override
	@DeleteMapping(value = "deletetax")
	@ResponseBody
	public ResponseEntity<Tax> deleteTax(@RequestBody TaxDTO taxDTO) {
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.itaxService.deleteTax(this.convertDTO(taxDTO)));
	}
	
}
