package de.gaudinicki.customer_service;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRegistrationRequest.firstName())
                .lastName(customerRegistrationRequest.lastName())
                .email(customerRegistrationRequest.email())
                .build();

        // TODO: check if email is valid
        // TODO: check if email is not already taken
        // TODO: store customer in DB
        customerRepository.save(customer);
    }
}
