package com.scm.forms;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class userform {
    @NotBlank(message = "Username is Required")
    @Size(min = 3 , message = "Minimum 3 Character is required")
    private String name;
    @Email(message = "Invalid Email Address")
    @NotBlank(message = "Email is Required")
    private String email;
    @NotBlank
    @Size(min = 6 , message = "Minimum 3 Character is required")
    private String password;
    @NotBlank
    private String about;
    @Size(min = 10,message = "Invalid Phone Number")
    private String phoneNumber;
}
