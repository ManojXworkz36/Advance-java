package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@Table(name = "actor")
public class ActorEntity {
    @Id
    @Column(name = "a_id")

    private int id;
    @Column(name = "a_name")
    private  String name;
    @Column(name = "a_industry")
    private  String industry;
    @Column(name = "i_bestmovie")
    private String bestMovie;
    @Column(name = "i_dob")
    private  String dob;
}
