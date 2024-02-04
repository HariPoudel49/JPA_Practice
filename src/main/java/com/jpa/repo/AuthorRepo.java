package com.jpa.repo;

import com.jpa.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AuthorRepo extends JpaRepository<Author, Long> {

}
