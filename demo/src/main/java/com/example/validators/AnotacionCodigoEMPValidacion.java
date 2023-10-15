package com.example.validators;

import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AnotacionCodigoEMPValidacion implements ConstraintValidator<AnotacionCodigoEMP, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if (value==null) {
			return false;
		}
		return Pattern.matches("^EMP-[a-zA-Z]{3}-\\d{4}$", value);
	}

}
