package ic.interfaces.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import ic.model.entity.Part;

public interface IpartController {

	ResponseEntity<Part> insert(Part part);
	
	ResponseEntity<Part> update(Part part);
	
	ResponseEntity<List<Part>> listParts();
	
	ResponseEntity<Part> deletePart(Part part);
}
