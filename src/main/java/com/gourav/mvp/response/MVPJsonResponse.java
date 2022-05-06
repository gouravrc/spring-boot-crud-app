package com.gourav.mvp.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MVPJsonResponse {

    private String firstName;

    private String lastName;

    public MVPJsonResponse(String string, String string2) {
        this.firstName = string;
        this.lastName = string2;
	}

	public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
