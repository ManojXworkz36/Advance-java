package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "traffic")
public class TrafficEntity {
    @Id
    @Column(name = "t_id")
    private  int id;
    @Column(name = "t_area")
    private String area;
    @Column(name = "t_state")
    private String state;
    @Column(name = "t_country")
    private String country;
}
