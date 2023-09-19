package tz.co.gepg.autoDeployment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tz.co.gepg.autoDeployment.entity.Registration;
@Repository

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}
