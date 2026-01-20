package com.ogunniwa.expensetracker.controller;

import com.ogunniwa.expensetracker.model.Expense;
import com.ogunniwa.expensetracker.service.ExpenseManager;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private ExpenseManager expenseManager = new ExpenseManager();

    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        expenseManager.addExpense(expense);
        return expense;
    }

    @GetMapping
    public ArrayList<Expense> getAllExpenses() {
        return expenseManager.getAllExpenses();
    }
}