package com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.infrastructure.adapter.out;

import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.model.User;
import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.port.out.UserRepository;

import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.dtos.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;


@Component
public class JpaUserRepository implements UserRepository {

    private final SpringDataJpaUserRepository springDataJpaUserRepository;

    private final ModelMapper modelMapper;

    public JpaUserRepository(SpringDataJpaUserRepository springDataJpaUserRepository,
                             ModelMapper modelMapper) {
        this.springDataJpaUserRepository = springDataJpaUserRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return springDataJpaUserRepository.findAll(pageable);
    }

    @Override
    public User findById(Long id) {
        return springDataJpaUserRepository.findById(id).orElse(null);
    }

    @Override
    public User save(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        return springDataJpaUserRepository.save(user);
    }

    @Override
    public boolean existsByEmail(String email) {
        return springDataJpaUserRepository.existsByEmail(email);
    }
}