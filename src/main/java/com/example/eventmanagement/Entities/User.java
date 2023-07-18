package com.example.eventmanagement.Entities;

import lombok.*;



import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User  {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer UserId;
  private String firstname;
  private String lastname;

  @Enumerated(EnumType.STRING)
  private Role role;
  private String email;
  private String password;
  private Integer numTel;


  @OneToMany(cascade = CascadeType.ALL, mappedBy="user")
  private Set<Evenement> event;

}
