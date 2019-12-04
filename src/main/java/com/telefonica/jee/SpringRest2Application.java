package com.telefonica.jee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.telefonica.jee.model.Manufacturer;
import com.telefonica.jee.repository.ManufacturerRepository;

@SpringBootApplication
public class SpringRest2Application implements CommandLineRunner{

	
	@Autowired
	private ManufacturerRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRest2Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// Create data
		repository.save(new Manufacturer("man1", "department1"));
		repository.save(new Manufacturer("man2", "department2"));
		repository.save(new Manufacturer("man3", "department3"));

	}


}
