package com.portal.portal_gym_be.repository;

import com.portal.portal_gym_be.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
