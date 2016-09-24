package com.lucide.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_model")
@Data
public class User {
    @Id
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private Integer id;
    private String name;
    private String email;
    private String password;
}
