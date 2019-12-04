package com.telefonica.jee.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.telefonica.jee.model.Manufacturer;
import com.telefonica.jee.repository.ManufacturerRepository;


@RestController
public class ManufacturerController {

	private final Logger log = LoggerFactory.getLogger(ManufacturerController.class);

	@Autowired
	private ManufacturerRepository repository;
	
	@GetMapping("/manufacturers/{id}")
	public Manufacturer getManufacturer(@PathVariable Long id) {
		log.info("GET Request to get manufacturer with Id: {}", id);
		return repository.findById(id).get();
	}
	
}
