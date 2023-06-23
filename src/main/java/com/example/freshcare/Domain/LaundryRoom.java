package com.example.freshcare.Domain;

import javax.persistence.*;
@Entity
public class LaundryRoom {
    @Id
    @Column(name = "LAUNDRYIDX")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "LAUNDRY_SEQ")
    @SequenceGenerator(name="LAUNDRY_SEQ", sequenceName = "LAUNDRY_SEQ", initialValue = 0, allocationSize = 1)
    private Long laundryIDX;
    @Column(name = "LAUNDRYNAME")
    private String laundryName;

    public Long getLaundryIDX() {
        return laundryIDX;
    }

    public void setLaundryIDX(Long laundryIDX) {
        this.laundryIDX = laundryIDX;
    }

    public String getLaundryName() {
        return laundryName;
    }

    public void setLaundryName(String laundryName) {
        this.laundryName = laundryName;
    }
}