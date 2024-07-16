package com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @Email
    private String email;
    @NotBlank
    private String name;
}
