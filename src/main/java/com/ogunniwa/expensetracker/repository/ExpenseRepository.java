package com.ogunniwa.expensetracker.repository;

import com.ogunniwa.expensetracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}