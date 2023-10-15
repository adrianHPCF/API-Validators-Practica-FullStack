package com.example.validators;

import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AnotacionEmailValidacion implements ConstraintValidator<AnotacionEmail,String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if (value == null) {
			return false;
		}
		return Pattern.matches("^[A-Za-z0-9_.-]{2,}@([A-Za-z0-9-]{2,}\\\\.){1,}[A-Za-z]{1,}$", value);
	}

}
