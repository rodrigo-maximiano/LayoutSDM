package br.edu.ifsp.scl.sdm.layoutssdm;

import java.io.Serializable;

public class Contact implements Serializable {

    private String email;

    private String phone;

    private int typePhone;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getTypePhone() {
        return typePhone;
    }

    public void setTypePhone(int typePhone) {
        this.typePhone = typePhone;
    }
}
