package com.java.basics;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class BcryptEncodingExmaple {
    public static void main (String [] args){
        String rawPassword = "IwontTellyou";
        PasswordEncoder bcryptEncoder = new BCryptPasswordEncoder();
        String bcryptEncoded = bcryptEncoder.encode(rawPassword);
        System.out.println(("Bcrypt Encoded password:" + bcryptEncoder));
        Boolean isPasswordmatch = bcryptEncoder.matches(rawPassword,bcryptEncoded);
        System.out.println("Password matches:" + isPasswordmatch);
    }
}

