package com.example.freshcare.Repository;

import com.example.freshcare.Domain.LaundryRoom;
import com.example.freshcare.Domain.Machien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaMachienRepository extends JpaRepository<Machien,Long>, MachienRepository {


}
