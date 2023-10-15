package com.example.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.model.Empleado;
@Primary
@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	ArrayList<Empleado> Lista =( new ArrayList<>(Arrays.asList(new Empleado (1,"adrian","adrian.hdez.plaza@gmail.com","EMP-VTS-2233"), new Empleado(2,"Daniel","dani@gmail.com","EMP-CTB-8909"))));

	@Override
	public ArrayList<Empleado> VerEmpleados() {
		// TODO Auto-generated method stub
		return Lista;
	}

	@Override
	public Empleado Crear(Empleado e) {
		Lista.add(e);
		return null;
	}

	@Override
	public Empleado Modificar(Empleado e) {
		for (Empleado employee : Lista) {
			if (employee.getId()==e.getId()) {
				employee.setNombre(e.getNombre());
				employee.setEmail(e.getEmail());
				return e;
			}
			
		}
		return null;
	}

	@Override
	public void Eliminar(int id) {
		for (Empleado employee : Lista) {
			if (employee.getId()==id) {
				Lista.remove(employee);
			}
		}
		
	}

}
