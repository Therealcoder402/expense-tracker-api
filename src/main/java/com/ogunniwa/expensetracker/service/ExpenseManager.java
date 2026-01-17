package com.ogunniwa.expensetracker.service;

import com.ogunniwa.expensetracker.model.Expense;
import java.util.ArrayList;

public class ExpenseManager {
    private ArrayList<Expense> expenseArrayList = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenseArrayList.add(expense);
    }

    public ArrayList<Expense> getAllExpenses() {
        return new ArrayList<>(expenseArrayList);
    }

    public double calculateTotal() {
        double sum = 0;
        for (Expense e : expenseArrayList) {
            sum = e.getAmount() + sum;
        }
        return sum;
    }

    public ArrayList<Expense> filterByCategory(String category) {
        ArrayList<Expense> expenseByCategory = new ArrayList<>();
        for (Expense e : expenseArrayList) {
            if (category.equalsIgnoreCase(e.getCategory())) {
                expenseByCategory.add(e);
            }
        }
        return expenseByCategory;
    }

    public double calculateTotalByCategory(String category) {
        double sum = 0;
        for (Expense e : expenseArrayList) {
            if (category.equalsIgnoreCase(e.getCategory())) {
                sum = e.getAmount() + sum;
            }
        }
        return sum;
    }
}