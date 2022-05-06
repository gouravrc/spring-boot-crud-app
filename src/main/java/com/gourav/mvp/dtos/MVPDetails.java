package com.gourav.mvp.dtos;

public class MVPDetails {


    private String id;
    private String fullName;
    private String address;

    public MVPDetails(String string, String string2, String string3) {
        this.id = string;
        this.fullName = string2;
        this.address = string3;
    }

    public String getId (){
        return id;
    }
    public void setId (String id){
        this.id = id;
    }

    public String getFullName(){
        return fullName;
    }
    public void setFullName(String full_name) {
        this.fullName = full_name;
    }

    public String getAddress (){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
