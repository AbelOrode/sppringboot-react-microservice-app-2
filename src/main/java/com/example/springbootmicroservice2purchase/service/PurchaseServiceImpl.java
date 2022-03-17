package com.example.springbootmicroservice2purchase.service;

import com.example.springbootmicroservice2purchase.model.Purchase;
import com.example.springbootmicroservice2purchase.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    //Access the purchase-service repo by instantiating the PurchaseRepository class
    @Autowired
    private final PurchaseRepository purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository){
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public Purchase savePurchase(Purchase purchase){
        purchase.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchase);
    }

    @Override
    public List<Purchase> findAllPurchasesOfUser(Long userId){
        return purchaseRepository.findAllByUserId(userId);
    }


}
