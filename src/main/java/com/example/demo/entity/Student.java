package com.example.demo.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "students" )
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "surname")
  private String surname;

@JoinColumn(name = "group_id")
@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
private Group group;

  @JoinColumn(name = "address_id")
 @OneToOne(optional=false, cascade=CascadeType.ALL)
 private Address address;

}
