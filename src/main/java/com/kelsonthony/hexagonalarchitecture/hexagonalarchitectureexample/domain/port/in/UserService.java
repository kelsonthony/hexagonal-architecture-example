package com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.port.in;

import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.model.User;

public interface UserService {
    User getUserById(Long id);
    User createUser(User user);

}
