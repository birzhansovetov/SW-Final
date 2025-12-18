package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "subjects")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "subjects")

    private List<Student> students;
}

