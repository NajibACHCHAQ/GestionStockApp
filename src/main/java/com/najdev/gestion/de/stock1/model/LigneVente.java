package com.najdev.gestion.de.stock1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@EqualsAndHashCode (callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "LigneVente ")
public class LigneVente extends AbstractEntity
{
    @ManyToOne
    @JoinColumn(name = "idvente")
    private String idvente;

    private BigDecimal quantite;
}
