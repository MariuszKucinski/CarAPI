package com.mariuszkucinski.carapi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.ZoneId;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @NotNull
    @NotBlank
    @Size(max = 100)
    private String companyName;

    @NotNull
    @NotBlank
    @Min(1900)
    private int yearOfCreation;


    @OneToMany
    private List<Car> carList;


}
