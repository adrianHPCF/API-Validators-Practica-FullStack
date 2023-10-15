package com.example.service;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;

import com.example.model.Empleado;

public interface EmpleadoService {
	public ArrayList <Empleado> VerEmpleados();
	public Empleado Crear(Empleado e);
	public Empleado Modificar(Empleado e);
	public void Eliminar(int id);
}