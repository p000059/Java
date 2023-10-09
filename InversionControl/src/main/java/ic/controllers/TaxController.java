package ic.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ic.controllers.interfaces.ItaxController;
import ic.dto.TaxDTO;
import ic.model.Tax;
import ic.service.interfaces.ItaxService;

@RequestMapping(value = "/")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class TaxController implements ItaxController {

	@Autowired
	private ItaxService itaxService;
	
	@Override
	@PostMapping(value = "inserttax")
	@ResponseBody
	public ResponseEntity<Tax> insertTax(@RequestBody TaxDTO taxDTO) {
		
		Tax objectTax = new Tax();
		
		BeanUtils.copyProperties(taxDTO, objectTax);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.itaxService.insert(objectTax));
	}

}
