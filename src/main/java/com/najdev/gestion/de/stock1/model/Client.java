package com.najdev.gestion.de.stock1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;


@Data
@NoArgsConstructor
@EqualsAndHashCode (callSuper = true)
@AllArgsConstructor
@Entity
@Table (name = "Client")
public class Client extends AbstractEntity
{
    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Embedded
    private String adresse;

    @Column(name = "photo")
    private String photo;

    @Column(name = "mail")
    private BigDecimal mail;

    @Column(name = "numTel")
    private String numTel;

    @OneToMany (mappedBy = "client")
    private List<CommandeClient> commandeClient;

}
