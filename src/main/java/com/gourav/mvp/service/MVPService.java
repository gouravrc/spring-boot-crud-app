package com.gourav.mvp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class MVPService {

    @Value("${app.name: [Default] MVP APP}")
    private String appName;

    public String getFirstAPI (){
        return "This is my first API";
    }

    public String getAppName (){
        return appName;
    }
}
