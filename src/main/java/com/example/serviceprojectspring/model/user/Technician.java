package com.example.serviceprojectspring.model.user;

import com.example.serviceprojectspring.model.Offered;
import com.example.serviceprojectspring.model.Ordered;
import com.example.serviceprojectspring.model.Users;
import com.example.serviceprojectspring.model.services.UnderService;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
public class Technician extends Users {

    ArrayList<String> reviews;
    double point;
    TecStatus tecStatus;
    @OneToMany(orphanRemoval = true)
    List<Ordered>ordereds = new ArrayList<>();

    @OneToMany(orphanRemoval = true)
    List<Offered> offereds = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    Set<UnderService> underServices = new HashSet<>();
    //ye aks ham bayd vase in biad
}
