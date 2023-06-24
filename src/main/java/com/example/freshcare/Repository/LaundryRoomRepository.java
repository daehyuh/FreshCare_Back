package com.example.freshcare.Repository;


import com.example.freshcare.Domain.LaundryRoom;

import java.util.List;

public interface LaundryRoomRepository {
    LaundryRoom save(LaundryRoom user);
    List<LaundryRoom> findAll();
}