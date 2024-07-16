package com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.application.service.impl;

import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.application.exception.EmailAlreadyExistsException;
import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.model.User;
import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.port.in.UserService;
import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.port.out.UserRepository;
import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.dtos.UserDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    @Transactional
    public User createUser(UserDto user) {
        // Verifica se o email já existe
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new EmailAlreadyExistsException(user.getEmail());
        }

        return userRepository.save(user);
    }
}