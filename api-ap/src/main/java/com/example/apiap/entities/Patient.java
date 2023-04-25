package com.example.apiap.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

// classe pour gerer les patients
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // la notation id donc on a creer une entite jpa
    private Long id;
    @Column(length = 50 )
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private boolean malade;
    private int score;
}
