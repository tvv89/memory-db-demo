package com.example.memorydbdemo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    long id;
    @Column(name = "firstname")
    String firstName;
    @Column(name = "lastname")
    String lastName;
}
