package com.oneHealth.DoctorBankDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneHealth.DoctorBankDetails.entity.BankDetails;



/**
 * The BankDetailsRepository interface extends JpaRepository to provide the necessary
 * methods for performing CRUD (Create, Read, Update, Delete) operations on the
 * BankDetails entity. It automatically generates the implementation for the
 * repository, allowing interactions with the database and the BankDetails table.
 * @author Anup
 * @version 3.9.10
 */
public interface BankDetailsRepository extends JpaRepository<BankDetails, Long> {

}
