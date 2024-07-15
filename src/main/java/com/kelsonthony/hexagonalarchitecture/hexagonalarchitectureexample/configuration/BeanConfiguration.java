package com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.configuration;

import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.port.out.UserRepository;
import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.infrastructure.adapter.out.JpaUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public UserRepository userRepository(JpaUserRepository jpaUserRepository) {
        return jpaUserRepository;
    }
}