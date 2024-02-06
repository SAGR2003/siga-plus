package co.edu.unisabana.sigaplus.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int semester;
}
