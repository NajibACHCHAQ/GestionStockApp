package com.najdev.gestion.de.stock1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode (callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "Roles ")
public class Roles extends AbstractEntity
{
    private String nom;
}
