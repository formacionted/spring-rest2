package com.telefonica.jee.repository;

import org.springframework.stereotype.Repository;

import com.telefonica.jee.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long>{

}
