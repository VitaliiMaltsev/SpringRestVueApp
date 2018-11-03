package com.company.springrestapp.repo;

import com.company.springrestapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<User, String> {
}
