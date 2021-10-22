package com.example.raihan_crud_customer.services;

import com.example.raihan_crud_customer.entities.CustomerEntity;
import com.example.raihan_crud_customer.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public CustomerEntity addCustomer(CustomerEntity param) {
        return customerRepository.save(param);
    }

    @Override
    public List<CustomerEntity> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public CustomerEntity getById(int id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public CustomerEntity updateCustomer(CustomerEntity param) {
        return customerRepository.save(param);
    }

    @Override
    public void deleteCustomer(int id) {

    }


}
