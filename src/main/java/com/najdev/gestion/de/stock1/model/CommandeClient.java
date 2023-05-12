package com.najdev.gestion.de.stock1.model;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;


@Data
@EqualsAndHashCode (callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CommandeClient")
public class CommandeClient extends AbstractEntity
{

    @Column(name = "code")
    private String nom;

    @Column(name = "prenom")
    private Instant dateCommande;

    @ManyToOne
    @JoinColumn (name = "idclient")
    private String client;

    @OneToMany (mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;




}
