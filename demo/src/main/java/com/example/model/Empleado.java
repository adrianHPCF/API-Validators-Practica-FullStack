package com.example.model;
import jakarta.validation.constraints.NotNull;
import com.example.validators.AnotacionCodigoEMP;
import com.example.validators.AnotacionEmail;
import com.example.validators.AnotacionNPositivo;
/*
import jakarta.validation.constraints.Email;

import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

son todos los paquetes que he intentado usar, pero como no me funciona lombok los he hecho a mano
*/

public class Empleado {
	@AnotacionNPositivo
	int id;
	@NotNull
	String nombre;
	@AnotacionEmail
	String email;
	@AnotacionCodigoEMP
	String codigo;
	public Empleado() {
		
	}
	public Empleado(int id, @NotNull String nombre, String email, String Codigo) {
		this.id=id;
		this.nombre=nombre;
		this.email=email;
		this.codigo=Codigo;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


}
