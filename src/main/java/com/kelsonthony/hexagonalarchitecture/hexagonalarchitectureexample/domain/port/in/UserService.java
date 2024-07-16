package com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.port.in;

import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.model.User;
import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.dtos.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    User getUserById(Long id);
    User createUser(UserDto user);
    Page<UserDto> findAll(Pageable pageable);

}
