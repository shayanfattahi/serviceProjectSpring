package com.example.serviceprojectspring.service;

import com.example.serviceprojectspring.model.Offered;
import com.example.serviceprojectspring.repository.OfferedRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class OfferedService {

    private final OfferedRepo offeredRepo;

    public Optional<Offered> readLogInClientOffered(long id1 , long id2){
        return offeredRepo.readOfferedsByClientIdAndId_Order(id1 , id2);
    }
}
