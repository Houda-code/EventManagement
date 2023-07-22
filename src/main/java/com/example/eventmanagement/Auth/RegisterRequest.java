package com.example.eventmanagement.Auth;


import com.example.eventmanagement.Entities.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Integer numTel;
    private Role role;
<<<<<<< HEAD
}
=======
}
>>>>>>> 90af3fe1a0f63b7be6a9e5fa3cc32222cd4a87fe
