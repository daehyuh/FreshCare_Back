package com.example.freshcare.Repository;

import com.example.freshcare.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaUserRepository extends JpaRepository<User,Long>, UserRepository {

}
