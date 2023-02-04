package com.example.serviceprojectspring.service;

import com.example.serviceprojectspring.model.user.Client;
import com.example.serviceprojectspring.repository.usersRepo.ClientRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientService {
    private final ClientRepo clientRepo;

    public boolean emailExist(String email){
        return clientRepo.findClientByEmail(email) != null;
    }

    public boolean signUpClient(Client client) {
        if (emailExist(client.getEmail())) {
            System.out.println("Account mojoode!!!");
            return false;
        } else {
            clientRepo.save(client);
            System.out.println("account save shod");
            return true;
        }
    }

    public boolean signInClient(String email , String pass){
        boolean flag = false;
        Client client = clientRepo.findClientByEmail(email);
        if (emailExist(client.getEmail())){
            if (client.getPass().equals(pass)){
                System.out.println("ba movafaghiat oomadi too");
                flag = true;
            }else {
                System.out.println("yek khata dri!!!");
                flag =  false;
            }
        }
        return flag;
    }
}
