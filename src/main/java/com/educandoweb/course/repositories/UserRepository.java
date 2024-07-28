package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// O que vai no <> é a entidade e o tipo dela
public interface UserRepository extends JpaRepository<User, Long> {

}
