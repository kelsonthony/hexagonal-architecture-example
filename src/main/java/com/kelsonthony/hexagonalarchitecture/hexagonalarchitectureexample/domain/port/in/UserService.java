package com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.port.in;

import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.model.User;
import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.dtos.UserDto;

public interface UserService {
    User getUserById(Long id);
    User createUser(UserDto user);

}
