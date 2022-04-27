package com.mariuszkucinski.carapi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.transaction.support.ResourceHolderSupport;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "car")
public class Car extends ResourceHolderSupport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @NotNull
    @NotBlank
    private String model;

    @NotNull
    @NotBlank
    private String version;

    @NotNull
    @NotBlank
    private String color;

    @NotNull
    @NotBlank
    @Min(1900)
    private int yearOfProduction;

    @ManyToOne
    private Brand brand;

}
