package com.example.freshcare.Repository;

import com.example.freshcare.Domain.Machien;
import com.example.freshcare.Domain.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    List<User> findAll();



    @Transactional
    @Modifying
    @Query("SELECT m FROM User m WHERE m.userRoom = ?1")
    List<User> findByUserRoom(String room);

    boolean existsByuserIdx(Long id);

    

}