package com.example.freshcare.Service;

import com.example.freshcare.Domain.LaundryRoom;
import com.example.freshcare.Domain.User;
import com.example.freshcare.Repository.LaundryRoomRepository;
import com.example.freshcare.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaundryRoomService {
    private final LaundryRoomRepository laundryRoomRepository;
    private PasswordEncoder passwordEncoder;
    @Autowired
    public static String ePw;
    public LaundryRoomService(LaundryRoomRepository laundryRoomRepository) {
        this.laundryRoomRepository = laundryRoomRepository;
    }

    public Long save(LaundryRoom laundryRoom){
        laundryRoomRepository.save(laundryRoom);
        return laundryRoom.getLaundryIDX();
    }

    public List<LaundryRoom> findAll(){
        return laundryRoomRepository.findAll();
    }

}
