package com.example.raihan_crud_customer.controller;


import com.example.raihan_crud_customer.entities.CustomerEntity;
import com.example.raihan_crud_customer.repositories.CustomerRepository;
import com.example.raihan_crud_customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")


public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerService customerService;

    @GetMapping(value = "CheckApi")
    public String CheckApi() {
        return "Test API Done!";
    }

    @PostMapping(value = "addCustomer")
    public CustomerEntity addNewCustomer(@RequestBody CustomerEntity param) {
        CustomerEntity customer = customerService.addCustomer(param);
        return customer;
    }

    @GetMapping(value = "getAllCustomer")
    public List<CustomerEntity> getAllCustomer() {
        List<CustomerEntity> customerList = customerService.getAllCustomer();
        return customerList;
    }

    @GetMapping(value = "getById")
    public CustomerEntity getById(@RequestParam int id) {
        CustomerEntity customer = customerService.getById(id);
        return customer;
    }

    @PostMapping(value = "updateCustomer")
    public CustomerEntity updateCustomer(@RequestBody CustomerEntity param) {
//        return customerRepository.save(param).toString(); // return string, klo public String.
        CustomerEntity customer = customerService.updateCustomer(param);
//        return customerRepository.save(param); // return json, klo pake public namaEntity
        return customer;
    }

    @GetMapping(value = "deleteCustomer")
    public String deleteCustomer(@RequestParam int id) {

        CustomerEntity customer = customerRepository.findById(id).get(); // kalau mau return byId, delete dlu
        customerRepository.deleteById(id);
//        customerRepository.deleteById(id);
//            customerService.deleteCustomer(id);
//            List<CustomerEntity> customer = customerService.getAllCustomer();
//        List<CustomerEntity> customer = customerRepository.findAll(); // kalau mau return semua list, delete dlu
          return "Deleted Customer Id : " + id; // return String, pake public String,
//         return customer;
    }


}
