package com.example.freshcare.Controller;

public class UserForm {
    public Long USERIDX;
    public String USERROOM;
    public String USEREMAIL;
    public String USERPHONE;
    public String USERPW;

    public Long getUSERIDX() {
        return USERIDX;
    }

    public void setUSERIDX(Long USERIDX) {
        this.USERIDX = USERIDX;
    }

    public String getUSERROOM() {
        return USERROOM;
    }

    public void setUSERROOM(String USERROOM) {
        this.USERROOM = USERROOM;
    }

    public String getUSEREMAIL() {
        return USEREMAIL;
    }

    public void setUSEREMAIL(String USEREMAIL) {
        this.USEREMAIL = USEREMAIL;
    }

    public String getUSERPHONE() {
        return USERPHONE;
    }

    public void setUSERPHONE(String USERPHONE) {
        this.USERPHONE = USERPHONE;
    }

    public String getUSERPW() {
        return USERPW;
    }

    public void setUSERPW(String USERPW) {
        this.USERPW = USERPW;
    }

    @Override
    public String toString() {
        return "UserForm{" +
                "USERIDX=" + USERIDX +
                ", USERROOM='" + USERROOM + '\'' +
                ", USEREMAIL='" + USEREMAIL + '\'' +
                ", USERPHONE='" + USERPHONE + '\'' +
                ", USERPW='" + USERPW + '\'' +
                '}';
    }
}
