package com.example.serviceprojectspring.repository.servicesRepo;

import com.example.serviceprojectspring.model.services.Services;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepo extends JpaRepository<Services , Long> {

}
