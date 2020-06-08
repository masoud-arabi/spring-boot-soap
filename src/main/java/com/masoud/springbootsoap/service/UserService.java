package com.masoud.springbootsoap.service;

import com.techprimers.spring_boot_soap_example.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private static final Map<String, User> users=new HashMap<>();

    @PostConstruct
    public void initialize(){
        User masoud=new User();
        masoud.setName("masoud");
        masoud.setEmpId(3256);
        masoud.setSalary(45000);

        User sheila=new User();
        sheila.setName("sheila");
        sheila.setEmpId(4567);
        sheila.setSalary(52000);

        User ali=new User();
        ali.setName("ali");
        ali.setEmpId(6423);
        ali.setSalary(60000);

        users.put(masoud.getName(),masoud);
        users.put(ali.getName(),ali);
        users.put(sheila.getName(),sheila);

    }
    public User getUsers(String name){
        return users.get(name);
    }


}
