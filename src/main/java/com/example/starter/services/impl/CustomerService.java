package com.example.starter.services.impl;

import com.example.starter.dto.Address.DtoAddress;
import com.example.starter.dto.Customer.DtoCustomer;
import com.example.starter.dto.Customer.DtoCustomerIU;
import com.example.starter.entities.Address;
import com.example.starter.entities.Customer;
import com.example.starter.repository.CustomerRepository;
import com.example.starter.services.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService
{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public DtoCustomer findCustomerById(Long id) {
        DtoCustomer dtoCustomer=new DtoCustomer();
        DtoAddress dtoAddress=new DtoAddress();

        Optional<Customer> optional=customerRepository.findById(id);
        if(optional.isEmpty())return null;
        Customer customer=optional.get();
        Address address=customer.getAddress();
        BeanUtils.copyProperties(customer,dtoCustomer);
        BeanUtils.copyProperties(address,dtoAddress);

        dtoCustomer.setAddress(dtoAddress);

        return dtoCustomer;
    }

    @Override
    public DtoCustomer SaveCustomer(DtoCustomerIU dtoCustomer) {
        Customer customer=new Customer();
        Address address=new Address();
        if(dtoCustomer.getAddress()!=null && dtoCustomer.getName()!=null){

            BeanUtils.copyProperties(dtoCustomer,customer);
            BeanUtils.copyProperties(dtoCustomer.getAddress(),address);
            customer.setAddress(address);
            Customer savedCustomer=customerRepository.save(customer);

            DtoCustomer result=new DtoCustomer();
            DtoAddress resultAddress=new DtoAddress();

            BeanUtils.copyProperties(savedCustomer.getAddress(),resultAddress);
            BeanUtils.copyProperties(savedCustomer,result);
            result.setAddress(resultAddress);

            return result;

        }
        else {
            return null;
        }
    }
}
