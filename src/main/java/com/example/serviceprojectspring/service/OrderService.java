package com.example.serviceprojectspring.service;

import com.example.serviceprojectspring.model.Ordered;
import com.example.serviceprojectspring.repository.OrderRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderService {

    private final OrderRepo orderRepo;

    public void createOrder(Ordered ordered){
        if (ordered.getPrice() < ordered.getUnderService().getPrices()){
            System.out.println("price problem!!!");
        }else {
            orderRepo.save(ordered);
        }
    }
    public Optional<Ordered> readLogInClientOrder(long id){
        return orderRepo.readOrderedsByClientId(id);
    }

//    public List<Ordered> readOrderWithNoTech(long id){
//        return orderedRepo.readOrderWithNoTech(id);
//    }

//    public Ordered readById(long id){
//        return orderedRepo.readById(id);
//    }

//    public void update(Ordered ordered){
//        orderedRepo.update(ordered);
//    }

    public Optional<Ordered> indefinitService(long id){
        return orderRepo.readOrderedsByAcceptedIsFalseAndClientId(id);
    }

    public Optional<Ordered> acceptedService(long id){
        return orderRepo.readOrderedsByAcceptedIsTrueAndClientId(id);
    }

    public Optional<Ordered> doneServices(long id){
        return orderRepo.readOrderedsByAcceptedIsTrueAndDoneIsTrueAndClientId(id);
    }

//    public List<Ordered> readOrderWithNoTechForTech(){
    //felan bemoon in oon join daras
//        return orderedRepo.readOrderWithNoTechForTech();
//    }
}
