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
@Table(name = "ocean")
public class OceanEntity {
    @Id
    @Column(name = "o_id")
    private int id;
    @Column(name = "o_name")
    private String name;
    @Column(name = "o_country")
    private  String country;
    @Column(name = "o_continent")

    private  String continent;
@Column(name = "o_width")
    private  int width;
}
