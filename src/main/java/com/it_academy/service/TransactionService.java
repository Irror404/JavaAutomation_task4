package com.it_academy.service;
import com.it_academy.entity.Transaction;

import java.util.Scanner;

public class TransactionService {
    public static Transaction inputTransaction() {
        Transaction transaction = new Transaction();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter transactions amount: ");
        transaction.setAmount(Double.parseDouble(scanner.nextLine()));
        return transaction;
    }
}
