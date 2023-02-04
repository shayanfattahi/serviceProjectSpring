package com.example.serviceprojectspring.repository.usersRepo;

import com.example.serviceprojectspring.model.user.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepo extends JpaRepository<Client , Long> {

    Optional<Client>findClientByEmail(String email);
}
