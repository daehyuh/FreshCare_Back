package com.example.freshcare;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MEMBER")
public class Member {
    @Id
    @Column(name = "member_idx")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "Member_seq")
    @SequenceGenerator(name="Member_seq", sequenceName = "Member_seq", initialValue = 0, allocationSize = 1)
    private Long memberIdx;
    @Column(name = "member_major")
    private String memberMajor;
    @Column(name = "member_id")
    private String memberId;
    @Column(name = "member_pw")
    private String memberPw;
    @Column(name = "member_name")
    private String memberName;
    @Column(name = "member_uni_id")
    private String memberUniId;
    @Column(name = "member_phone")
    private String memberPhone;
    @Column(name = "member_email")
    private String memberEmail;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "member_date")
    private Date memberDate;

    public Long getMemberIdx() {
        return memberIdx;
    }

    public void setMemberIdx(Long memberIdx) {
        this.memberIdx = memberIdx;
    }

    public String getMemberMajor() {
        return memberMajor;
    }

    public void setMemberMajor(String memberMajor) {
        this.memberMajor = memberMajor;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPw() {
        return memberPw;
    }

    public void setMemberPw(String memberPw) {
        this.memberPw = memberPw;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberUniId() {
        return memberUniId;
    }

    public void setMemberUniId(String memberUniId) {
        this.memberUniId = memberUniId;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public Date getMemberDate() {
        return memberDate;
    }

    public void setMemberDate(Date memberDate) {
        this.memberDate = memberDate;
    }


}

