package de.gaudinicki.customer_service;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {}
