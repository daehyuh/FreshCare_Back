package com.example.freshcare.Repository;

import com.example.freshcare.Domain.Machien;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

public interface MachienRepository {
    Machien save(Machien machien);
    List<Machien> findAll();
    @Transactional
    @Modifying
    @Query("SELECT m FROM Machien m WHERE m.LaundryIdx = ?1 and m.machienType = ?2 order by m.machienName")
    List<Machien> selectByLaundryIdx(Long id, Long type);

    @Query("SELECT to_char(m.washTime,'HH24:MI:SS') FROM Machien m WHERE m.machienIdx = ?1")
    String getTime(Long id);

    @Transactional
    @Modifying
    @Query("update Machien m set m.userId = ?2  where m.machienIdx = ?1")
    void joinUser(Long MACHIENIDX, long userId);
    @Transactional
    @Modifying
    @Query("update Machien m set m.washTime = ?2  where m.machienIdx = ?1")
    void joinDate(Long MACHIENIDX, Date date);

    @Transactional
    @Modifying
    @Query("update Machien m set m.washTime = sysdate()  where m.machienIdx = ?1")
    void deleteDate(Long MACHIENIDX);

    @Transactional
    @Modifying
    @Query("update Machien m set m.userId = NULL where m.machienIdx = ?1")
    void delete2Date(Long MACHIENIDX);

}