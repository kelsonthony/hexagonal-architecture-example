package com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.infrastructure.adapter.out;

import com.kelsonthony.hexagonalarchitecture.hexagonalarchitectureexample.domain.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaUserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

}