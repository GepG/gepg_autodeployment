package tz.co.gepg.autoDeployment.service;

import java.util.List;


import org.springframework.stereotype.Service;

import tz.co.gepg.autoDeployment.entity.Registration;

public interface RegistrationService {

	public Registration saveRegistration(Registration registration);
	public Registration getRegistrationById(Long id);
	public List<Registration> findAllRegistrations();
	
	
}
