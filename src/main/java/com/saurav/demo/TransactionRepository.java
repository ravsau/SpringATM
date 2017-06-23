package com.saurav.demo;



import org.springframework.data.repository.CrudRepository;

import com.saurav.demo.Transactions;

import antlr.collections.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TransactionRepository extends CrudRepository<Transactions, Long> {
	
	List findByAccountId(long accountId);

}