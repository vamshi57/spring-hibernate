package com.vamshi.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.vamshi.command.PatientCommand;
@Component
public class PatientValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.isAssignableFrom(PatientCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		PatientCommand cmd=(PatientCommand)target;
		System.out.println("PatientValidator.validate()");
		if(cmd.getName()==null||cmd.getName().equals("")) {
			errors.rejectValue("name", "patient.name.required");
		}
		if(cmd.getAge()==0) {
			errors.rejectValue("age", "patient.age.required");
		}
		if(cmd.getHospital()==null||cmd.getHospital().equals("")) {
			errors.rejectValue("hospital","patient.hospital.required");
		}
		if(cmd.getHospital().length()<3||cmd.getHospital().length()>12) {
			errors.rejectValue("hospital", "patient.hospital.length");
		}
		if(cmd.getLocation()==null||cmd.getLocation().equals("")) {
			errors.rejectValue("location", "patient.location.required");
		}
				
	}

}
