package com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.config;

import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.port.out.UserRepository;
import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.infrastructure.adapter.out.JpaUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean
    public UserRepository userRepository(JpaUserRepository jpaUserRepository) {
        return jpaUserRepository;
    }
}