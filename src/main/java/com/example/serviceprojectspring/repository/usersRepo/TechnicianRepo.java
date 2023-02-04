package com.example.serviceprojectspring.repository.usersRepo;

import com.example.serviceprojectspring.model.user.Client;
import com.example.serviceprojectspring.model.user.Technician;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TechnicianRepo extends JpaRepository<Technician , Long> {
    Optional<Technician> findClientByEmail(String email);
}
