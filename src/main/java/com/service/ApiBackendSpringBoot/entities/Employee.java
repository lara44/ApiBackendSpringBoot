package com.service.ApiBackendSpringBoot.entities;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
@Table(name = "employees")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;
}
