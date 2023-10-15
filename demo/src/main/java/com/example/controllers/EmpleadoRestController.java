package com.example.controllers;
import java.net.URI;
import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.model.Empleado;
import com.example.service.EmpleadoService;


@RestController
@RequestMapping("/empleados")
public class EmpleadoRestController {
	EmpleadoService EmpleadoService;
	
	public EmpleadoRestController (EmpleadoService servicio) {
		this.EmpleadoService=servicio;
	}
	
	@GetMapping
	public ResponseEntity<ArrayList<?>> listar (){
		ArrayList<Empleado> array = EmpleadoService.VerEmpleados();
		return ResponseEntity.ok(array);
		
	}
	@PostMapping
	public ResponseEntity<Empleado> Crear(@RequestBody @Validated Empleado EC){
		EmpleadoService.Crear(EC);
		URI a = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(EC.getId()).toUri(); 
		return ResponseEntity.created(a).build();	
	}
	@PutMapping
	public ResponseEntity<Empleado> modificar(@RequestBody @Validated Empleado EM){
		EmpleadoService.Modificar(EM);
		return ResponseEntity.ok(EM);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> Eliminar (@PathVariable @Validated int idDelete){
		EmpleadoService.Eliminar(idDelete);
		return ResponseEntity.noContent().build();
	}
}
