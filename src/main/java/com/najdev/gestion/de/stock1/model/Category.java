package com.najdev.gestion.de.stock1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import jakarta.persistence.OneToMany;

import java.util.List;

@Data
@EqualsAndHashCode (callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "category")

public class Category extends AbstractEntity
{
    @Column(name ="code")
    private String code;

    @Column (name = "designation")
    private String designation;

    @OneToMany (mappedBy = "category")
    private List<Article> articles;
}
