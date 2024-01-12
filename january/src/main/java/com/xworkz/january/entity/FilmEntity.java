package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "Film")
@AllArgsConstructor
public class FilmEntity {
@Id
@Column(name = "F-id")
    private int filmId;

    @Column(name = "F_name")
    private String filmname;

    @Column(name = "F_hero")
    private  String heroName;

    @Column(name = "F_director")
    private  String directorName;

    @Column(name = "F_releasedate")
    private String releasedate;

}
