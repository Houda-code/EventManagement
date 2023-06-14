package com.example.eventmanagement.Entities;

;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class User implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String UserName;
  @Enumerated(EnumType.STRING)
  private Role role;
  private String email;
  private String password;
  private Integer numTel;


  @OneToMany(cascade = CascadeType.ALL, mappedBy="user")
  private Set<Evenement> event;

}
