package co.edu.unisabana.sigaplus.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    private int id;

    private String name;

    private int semester;
}

