package com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.infrastructure.adapter.out;

import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.model.User;
import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.port.out.UserRepository;

import org.springframework.stereotype.Component;


@Component
public class JpaUserRepository implements UserRepository {

    private final SpringDataJpaUserRepository springDataJpaUserRepository;

    public JpaUserRepository(SpringDataJpaUserRepository springDataJpaUserRepository) {
        this.springDataJpaUserRepository = springDataJpaUserRepository;
    }

    @Override
    public User findById(Long id) {
        return springDataJpaUserRepository.findById(id).orElse(null);
    }

    @Override
    public User save(User user) {
        return springDataJpaUserRepository.save(user);
    }

    @Override
    public boolean existsByEmail(String email) {
        return springDataJpaUserRepository.existsByEmail(email);
    }
}