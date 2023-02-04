package com.example.serviceprojectspring.repository;

import com.example.serviceprojectspring.model.Offered;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OfferedRepo extends JpaRepository<Offered, Long> {

    Optional<Offered>readOfferedsByClientIdAndId_Order(Long id1 , Long id2);
}
