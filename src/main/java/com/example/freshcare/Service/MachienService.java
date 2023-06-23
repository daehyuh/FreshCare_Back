package com.example.freshcare.Service;

import com.example.freshcare.Domain.Machien;
import com.example.freshcare.Repository.MachienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MachienService {
    private final MachienRepository machienRepository;
    @Autowired
    public MachienService(MachienRepository machienRepository) {
        this.machienRepository = machienRepository;
    }

    public Long save(Machien machien){
        machienRepository.save(machien);
        return machien.getMachienIdx();
    }

    public List<Machien> findAll(){
        return machienRepository.findAll();
    }

    public List<Machien> selectByLaundryIdx(Long idx,Long type){
        return machienRepository.selectByLaundryIdx(idx, type);
    }

    public List<Machien> findByLaMachiens(String idx){
        return findByLaMachiens(idx);
    }


    public void joinUser(Long MACHIENIDX, Long userID){
        machienRepository.joinUser(MACHIENIDX, userID);
    }

    public void joinDate(Long MACHIENIDX, Date date){
        machienRepository.joinDate(MACHIENIDX, date);
    }

    public void deleteDate(Long MACHIENIDX){
        machienRepository.deleteDate(MACHIENIDX);
    }
    public void deleteDate2(Long MACHIENIDX){
        machienRepository.delete2Date(MACHIENIDX);
    }

    public String getTime(Long id){
        return machienRepository.getTime(id);
    }

}
