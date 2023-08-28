package collections.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import collections.controllers.interfaces.IDriverCarController;

@RequestMapping(value = "/forms")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class DriverCarController implements IDriverCarController {

	
}
