package com.example.eventmanagement.Entities;

;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer UserId;
  private String UserName;
  @Enumerated(EnumType.STRING)
  private Role role;
  private String email;
  private String password;
  private Integer numTel;


  @OneToMany(cascade = CascadeType.ALL, mappedBy="user")
  private Set<Evenement> event;

}
