package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// O que vai no <> é a entidade e o tipo dela
@Repository // essa annotation nao era necessario pois jpaRepository ja é componente do Spring
public interface UserRepository extends JpaRepository<User, Long> {
}
