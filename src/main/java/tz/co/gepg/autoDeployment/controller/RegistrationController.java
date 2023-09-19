package tz.co.gepg.autoDeployment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tz.co.gepg.autoDeployment.dto.RegistrationDto;
import tz.co.gepg.autoDeployment.dto.ResponseDetail;
import tz.co.gepg.autoDeployment.entity.Registration;
import tz.co.gepg.autoDeployment.service.RegistrationService;

@RestController
@RequestMapping("/register")
public class RegistrationController {
	
	@Autowired
	RegistrationService registrationService;
	

	

@PostMapping("/save")
public ResponseDetail saveRegistration(@RequestBody RegistrationDto registrationDto) {
ResponseDetail responseDetail = new ResponseDetail();
Registration registration = new Registration();
registration.setId(registrationDto.getRegId());
registration.setRegId(registrationDto.getRegId());
registration.setMnoCode(registrationDto.getMnoCode());
registration.setCalBackUrl(registrationDto.getCalBackUrl());
registration.setMsisDn(registrationDto.getMsisDn());
registration.setClientName(registrationDto.getClientName());
registration.setClientNin(registrationDto.getClientNin());
registration.setReqDt(registrationDto.getReqDt());
registration.setAgentNo(registrationDto.getAgentNo());
registration.setAgentName(registrationDto.getAgentName());

Registration registrationSaved = null;
try {
	registrationSaved = registrationService.saveRegistration(registration);
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
if(registrationSaved != null) {
	responseDetail.setStatusCode(true);
	responseDetail.setNotificationNid("SUCCESSFUL REGISTERED");
}else {
	responseDetail.setStatusCode(false);
	responseDetail.setNotificationNid("NOT SUCCESSFUL REGISTERED !");
}
return responseDetail;
}


@GetMapping(value = "/{id}")
public RegistrationDto getRegistration(@PathVariable Long id ) {
	RegistrationDto registrationDto = new RegistrationDto();
	Registration registration = null;
	
	
	try {
		registration = registrationService.getRegistrationById(id);
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}

	registrationDto.setId(registration.getId());
	registrationDto.setRegId(registration.getRegId());
	registrationDto.setMnoCode(registration.getMnoCode());
	registrationDto.setCalBackUrl(registration.getCalBackUrl());
	registrationDto.setMsisDn(registration.getMsisDn());
	registrationDto.setClientName(registration.getClientName());
	registrationDto.setClientNin(registration.getClientNin());
	registrationDto.setReqDt(registration.getReqDt());
	registrationDto.setAgentNo(registration.getAgentNo());
	registrationDto.setAgentName(registration.getAgentName());
	
	return registrationDto;
	
}

@GetMapping(value={"/all"})
public List<RegistrationDto> getAllRegistration() {
	RegistrationDto registrationDto = new RegistrationDto();
	List<Registration> registrationsList =null;
	List<RegistrationDto> registrationDtoList = new ArrayList<>();
	try {
		registrationsList = registrationService.findAllRegistrations();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	for(Registration registration : registrationsList) {
		registrationDto.setId(registration.getId());
		registrationDto.setAgentName(registration.getAgentName());
		registrationDto.setAgentNo(registration.getAgentNo());
		registrationDto.setCalBackUrl(registration.getCalBackUrl());
		registrationDto.setClientName(registration.getClientName());
		registrationDto.setClientNin(registration.getClientNin());
		registrationDto.setMnoCode(registration.getMnoCode());
		registrationDto.setMsisDn(registration.getMsisDn());
		registrationDto.setReqDt(registration.getReqDt());
		
	}
	
	
	
	return registrationDtoList;
}

}
