package com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.port.out;

import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.model.User;
import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.dtos.UserDto;

public interface UserRepository {
    User findById(Long id);
    User save(UserDto user);
    boolean existsByEmail(String email);
}
