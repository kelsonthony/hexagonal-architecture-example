package com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.port.out;

import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.model.User;
import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.dtos.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserRepository {
    Page<User> findAll(Pageable pageable);
    User findById(Long id);
    User save(UserDto user);
    boolean existsByEmail(String email);
}
