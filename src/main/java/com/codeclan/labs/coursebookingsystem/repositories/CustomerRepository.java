package com.codeclan.labs.coursebookingsystem.repositories;

import com.codeclan.labs.coursebookingsystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
