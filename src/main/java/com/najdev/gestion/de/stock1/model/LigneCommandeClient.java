package com.najdev.gestion.de.stock1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table (name = "LigneCommandeClient ")
public class LigneCommandeClient extends AbstractEntity
{
    @ManyToOne
    @JoinColumn (name = "idarticle")
    private Article article;

    @ManyToOne
    @JoinColumn (name = "idcommandeclient")
    private CommandeClient commandeClient;


}
