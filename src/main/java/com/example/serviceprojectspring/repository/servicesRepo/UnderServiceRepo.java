package com.example.serviceprojectspring.repository.servicesRepo;

import com.example.serviceprojectspring.model.services.UnderService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UnderServiceRepo extends JpaRepository<UnderService , Long> {

    Optional<UnderService>readUnderServicesByServicesId(Long id);
}
