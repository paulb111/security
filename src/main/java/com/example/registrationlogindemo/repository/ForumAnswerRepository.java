package com.example.registrationlogindemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.registrationlogindemo.model.ForumAnswer;

@Repository
public interface ForumAnswerRepository extends JpaRepository<ForumAnswer, Integer> {
}
