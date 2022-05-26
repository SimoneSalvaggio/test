package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entity.TransactionRequestHistory;

@Repository
public interface TransactionRequestHistoryRepository extends JpaRepository<TransactionRequestHistory, Long> {

}
