package ic.interfaces.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import ic.model.DTO.PartDTO;
import ic.model.entity.Part;

public interface IpartController {

	ResponseEntity<Part> insert(PartDTO partDTO);
	
	ResponseEntity<Part> update(PartDTO partDTO);
	
	ResponseEntity<List<Part>> listParts();
	
	ResponseEntity<Part> deletePart(PartDTO partDTO);
	
	ResponseEntity<List<Part>> listParts(String name);
}
