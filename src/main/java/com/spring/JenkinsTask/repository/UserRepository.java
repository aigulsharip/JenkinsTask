package com.spring.JenkinsTask.repository;

import com.spring.JenkinsTask.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
