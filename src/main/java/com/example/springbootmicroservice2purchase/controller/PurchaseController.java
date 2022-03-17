package com.example.springbootmicroservice2purchase.controller;


import com.example.springbootmicroservice2purchase.model.Purchase;
import com.example.springbootmicroservice2purchase.service.PurchaseService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@SecurityRequirement(name = "microservices-api")
@RequestMapping("api/purchase")//pre-path
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @PostMapping // http://api/purchase
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase){
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping("{userId}") //http://api/purchase/{courseId}
    public ResponseEntity<?> getAllPurchasesofUser(@PathVariable Long userId){
        return ResponseEntity.ok(purchaseService.findAllPurchasesOfUser(userId));
    }
}
