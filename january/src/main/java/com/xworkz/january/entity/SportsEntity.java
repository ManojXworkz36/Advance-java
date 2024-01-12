package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "sports")
@AllArgsConstructor
public class SportsEntity {
    @Id
@Column(name = "s_id")

    private int id;
@Column(name = "s_name")

    private String name;
@Column(name = "s_type")
    private  String type;
@Column(name = "s_country")
    private  String country;
@Column(name = "s_superstar")
    private String superStar;

}
