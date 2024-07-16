package com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.port.out;

import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.model.User;

public interface UserRepository {
    User findById(Long id);
    User save(User user);
    boolean existsByEmail(String email);
}
