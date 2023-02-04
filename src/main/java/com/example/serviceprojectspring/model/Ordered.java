package com.example.serviceprojectspring.model;

import com.example.serviceprojectspring.model.services.UnderService;
import com.example.serviceprojectspring.model.user.Client;
import com.example.serviceprojectspring.model.user.Technician;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Ordered {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    long price;
    String text;
    long date;
    String address;
    boolean accepted;
    boolean isDone;

    @ManyToOne
    UnderService underService;

    @ManyToOne
    Client client;

    @ManyToOne
    Technician technician;
}
