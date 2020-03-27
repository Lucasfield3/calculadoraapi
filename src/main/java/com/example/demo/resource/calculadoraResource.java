package com.example.demo.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Calculo;
@RestController
@RequestMapping("/calculadora")
public class calculadoraResource {

	@GetMapping("/{valor1}/{valor2}")
	public ResponseEntity<Calculo> calcular(@PathVariable double valor1, @PathVariable double valor2, @RequestParam("action")String funcao){
		
		Calculo c = new Calculo(valor1, valor2, funcao);
		
		return ResponseEntity.ok(c);
	}

	
}
