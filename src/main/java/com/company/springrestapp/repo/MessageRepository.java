package com.company.springrestapp.repo;

import com.company.springrestapp.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
