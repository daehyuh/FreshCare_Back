package com.example.freshcare.Domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MACHIEN")
public class Machien {
    @Id
    @Column(name = "MACHIENIDX")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "MACHIEN_SEQ")
    @SequenceGenerator(name="MACHIEN_SEQ", sequenceName = "MACHIEN_SEQ", initialValue = 0, allocationSize = 1)
    private Long machienIdx;
    @Column(name = "LAUNDRYIDX")
    private Long LaundryIdx;
    @Column(name = "USERIDX")
    private Long userId;
    @Column(name = "MACHIENNAME")
    private String machienName;
    @Column(name = "MACHIENTYPE")
    private Long machienType;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "WASHTIME")
    private Date washTime;

    public Long getMachienIdx() {
        return machienIdx;
    }

    public void setMachienIdx(Long machienIdx) {
        this.machienIdx = machienIdx;
    }

    public Long getLaundryIdx() {
        return LaundryIdx;
    }

    public void setLaundryIdx(Long laundryIdx) {
        LaundryIdx = laundryIdx;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMachienName() {
        return machienName;
    }

    public void setMachienName(String machienName) {
        this.machienName = machienName;
    }

    public Long getMachienType() {
        return machienType;
    }

    public void setMachienType(Long machienType) {
        this.machienType = machienType;
    }

    public Date getWashTime() {
        return washTime;
    }

    public void setWashTime(Date washTime) {
        this.washTime = washTime;
    }
}
