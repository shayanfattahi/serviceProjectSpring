package com.example.serviceprojectspring.model.services;

import com.example.serviceprojectspring.model.Offered;
import com.example.serviceprojectspring.model.Ordered;
import com.example.serviceprojectspring.model.user.Technician;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
public class UnderService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    long prices;
    String text;
    @OneToMany(orphanRemoval = true)
    List<Ordered> ordereds = new ArrayList<>();
    @OneToMany(orphanRemoval = true)
    List<Offered> offereds = new ArrayList<>();
    @ManyToOne
    Services services;
    @ManyToMany(mappedBy = "underServices")
    Set<Technician> technician = new HashSet<>();
}
