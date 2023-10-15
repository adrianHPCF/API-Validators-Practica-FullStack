package com.example.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AnotacionNPositivoValidacion implements ConstraintValidator<AnotacionNPositivo, Integer> {

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return value != null && value>0;
	}
	
}
