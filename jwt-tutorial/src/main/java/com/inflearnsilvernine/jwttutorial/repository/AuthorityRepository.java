package com.inflearnsilvernine.jwttutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inflearnsilvernine.jwttutorial.entity.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
