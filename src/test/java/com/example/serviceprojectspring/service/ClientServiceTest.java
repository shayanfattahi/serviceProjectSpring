package com.example.serviceprojectspring.service;

import com.example.serviceprojectspring.repository.usersRepo.ClientRepo;
import junit.framework.TestCase;
import lombok.AllArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
@AllArgsConstructor
public class ClientServiceTest extends TestCase {
    private final ClientRepo clientRepo;

    @Test
    public void emailExist() {
        String email = "shayanfattahi@yahoo.com";
        clientRepo.findClientByEmail(email);
    }

    @Test
    public void signUpClient() {
    }

    @Test
    public void signInClient() {
    }
}
