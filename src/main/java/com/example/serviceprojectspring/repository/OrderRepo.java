package com.example.serviceprojectspring.repository;

import com.example.serviceprojectspring.model.Ordered;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepo extends JpaRepository<Ordered , Long> {
    Optional<Ordered> readOrderedsByClientId(Long id);

    //Optional<Ordered>readOrderedsByTechnicianIdAndClientId(Long id);

    Optional<Ordered>readOrderedsByAcceptedIsFalseAndClientId(Long id);

    Optional<Ordered>readOrderedsByAcceptedIsTrueAndClientId(Long id);

    Optional<Ordered>readOrderedsByAcceptedIsTrueAndDoneIsTrueAndClientId(Long id);

    //yedoone joindar moonde
//    Optional<Ordered>
}
