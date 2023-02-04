package com.example.serviceprojectspring.service;


import com.example.serviceprojectspring.model.user.Client;
import com.example.serviceprojectspring.model.user.Technician;
import com.example.serviceprojectspring.repository.usersRepo.ClientRepo;
import com.example.serviceprojectspring.repository.usersRepo.TechnicianRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TechnicianService {

    private final TechnicianRepo technicianRepo;

    public boolean emailExist(String email){
        return technicianRepo.findClientByEmail(email) != null;
    }

    public boolean signUpTechnician(Technician technician) {
        if (emailExist(technician.getEmail())) {
            System.out.println("Account mojoode!!!");
            return false;
        } else {
            technicianRepo.save(technician);
            System.out.println("account save shod");
            return true;
        }
    }

    public boolean signInTechnician(String email , String pass){
        boolean flag = false;
        Technician technician = technicianRepo.findClientByEmail(email);
        if (emailExist(technician.getEmail())){
            if (technician.getPass().equals(pass)){
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
