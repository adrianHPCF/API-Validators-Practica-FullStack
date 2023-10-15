package com.example.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = AnotacionEmailValidacion.class)
public @interface AnotacionEmail {
	String mensaje() default "El email ingresado no es valido, debe tener el siguiente formato: email@gmail.com";
	Class<?>[] groups() default {};
	Class <? extends Payload>[] paylaod() default{};
	
}
