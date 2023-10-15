package com.example.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = AnotacionNPositivoValidacion.class)
public @interface AnotacionNPositivo {
	String mensaje() default "El numero debe ser positivo";
	Class <?>[] groups() default {};
	Class<? extends Payload> [] payload() default{};
}
