package com.example.serviceprojectspring.model.user;

import com.example.serviceprojectspring.model.Offered;
import com.example.serviceprojectspring.model.Ordered;
import com.example.serviceprojectspring.model.Users;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter @Setter
@Entity
public class Client extends Users {

    @OneToMany(orphanRemoval = true)
    List<Ordered> ordereds = new ArrayList<>();
    @OneToMany(orphanRemoval = true)
    List<Offered> offereds = new ArrayList<>();
}
