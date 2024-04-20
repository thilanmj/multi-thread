package com.codexmo.multithreads.repository;

import com.codexmo.multithreads.enitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
