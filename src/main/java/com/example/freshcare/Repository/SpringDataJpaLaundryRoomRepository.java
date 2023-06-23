package com.example.freshcare.Repository;

import com.example.freshcare.Domain.LaundryRoom;
import com.example.freshcare.Domain.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SpringDataJpaLaundryRoomRepository extends JpaRepository<LaundryRoom,Long>, LaundryRoomRepository {

}
