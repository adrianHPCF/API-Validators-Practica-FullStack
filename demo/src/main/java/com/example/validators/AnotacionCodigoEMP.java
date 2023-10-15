package com.example.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = AnotacionCodigoEMPValidacion.class)
public @interface AnotacionCodigoEMP {
	String mensaje() default "El formato del Código del empleado es inválido, debe tener el siguiente formato: EMP-(letra)(letra)(letra)-(numero)(numero)(numero)(numero)";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
