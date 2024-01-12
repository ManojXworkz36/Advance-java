package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "transport")
public class TransportEntity {
@Id
@Column(name = "t_id")
    private int id;
@Column(name = "t_name")
    private  String name;
@Column(name = "t_vehicle")
private  String vehicle;
@Column(name = "t_type")

     private String type;
     @Column(name = "t_ratings")
     private  String rating;


}
