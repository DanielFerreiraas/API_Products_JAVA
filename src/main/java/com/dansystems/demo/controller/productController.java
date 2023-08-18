package com.dansystems.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dansystems.demo.entities.Departament;
import com.dansystems.demo.entities.Product;

@RestController
@RequestMapping(value = "/products")

public class productController {

	@GetMapping
	public List<Product> getObjects() {

		Departament firstDepartament = new Departament(1L, "Tech");
		Departament secondDepartament = new Departament(2L, "Pet");
		
		Product p1 = new Product(1L, "Mac book pro", 400.0, firstDepartament);
		Product p2 = new Product(1L, "placa de vídeo", 40.0, firstDepartament);
		Product p3 = new Product(1L, "Casinha de cachorro", 10.0, secondDepartament);
		
		List<Product> list = Arrays.asList(p1, p2, p3);
		
		return list;

	}
}
