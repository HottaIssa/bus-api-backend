package com.saihoz.buses.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "buses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String num;
    private String placa;

    @CreationTimestamp
    private LocalDateTime createdAt;
    private String caracteristica;

    @ManyToOne
    private Model model;
    private boolean isActive;
}
