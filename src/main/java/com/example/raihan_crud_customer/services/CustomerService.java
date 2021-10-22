package com.example.raihan_crud_customer.services;

import com.example.raihan_crud_customer.entities.CustomerEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerService {

    CustomerEntity addCustomer(CustomerEntity param);

    List<CustomerEntity> getAllCustomer();

    CustomerEntity getById(int id);

    CustomerEntity updateCustomer(CustomerEntity param);

    void deleteCustomer(int id);
}
