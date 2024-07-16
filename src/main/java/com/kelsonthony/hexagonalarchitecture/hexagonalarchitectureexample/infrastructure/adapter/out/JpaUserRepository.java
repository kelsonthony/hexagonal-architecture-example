package com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.infrastructure.adapter.out;

import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.model.User;
import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.port.out.UserRepository;

import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.dtos.UserDto;
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
    public User save(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        return springDataJpaUserRepository.save(user);
    }

    @Override
    public boolean existsByEmail(String email) {
        return springDataJpaUserRepository.existsByEmail(email);
    }
}