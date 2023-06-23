package com.example.freshcare.Domain;

import javax.persistence.*;

@Entity
@Table(name = "USERTABLE")
public class User {
    @Id
    @Column(name = "USERIDX")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "USER_SEQ")
    @SequenceGenerator(name="USER_SEQ", sequenceName = "USER_SEQ", initialValue = 0, allocationSize = 1)
    private Long userIdx;
    @Column(name = "USERROOM")
    private String userRoom;
    @Column(name = "USEREMAIL")
    private String userMail;
    @Column(name = "USERPHONE")
    private String userPhone;
    @Column(name = "USERPW")
    private String userPw;

    public Long getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(Long userIdx) {
        this.userIdx = userIdx;
    }

    public String getUserRoom() {
        return userRoom;
    }

    public void setUserRoom(String userRoom) {
        this.userRoom = userRoom;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    @Override
    public String toString() {
        return "User{" +
                "userIdx=" + userIdx +
                ", userRoom='" + userRoom + '\'' +
                ", userMail='" + userMail + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userPw='" + userPw + '\'' +
                '}';
    }
}

