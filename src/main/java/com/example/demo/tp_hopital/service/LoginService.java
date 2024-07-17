package com.example.demo.tp_hopital.service;

public interface LoginService {

    public boolean isLogged();
    public boolean login(String user, String password);
}
