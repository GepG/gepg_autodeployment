package tz.co.gepg.autoDeployment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tz.co.gepg.autoDeployment.entity.Registration;
import tz.co.gepg.autoDeployment.repository.RegistrationRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	RegistrationRepository registrationRepository;
	@Override
	public Registration saveRegistration(Registration registration) {
		// TODO Auto-generated method stub
		return registrationRepository.save(registration);
	}

	@Override
	public Registration getRegistrationById(Long id) {
		// TODO Auto-generated method stub
		return registrationRepository.getOne(id);
	}

	@Override
	public List<Registration> findAllRegistrations() {
		// TODO Auto-generated method stub
		return registrationRepository.findAll();
	}



}
