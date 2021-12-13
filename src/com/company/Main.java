package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BankAccount bankAccount = new BankAccount();
        BankAccount.deposit(20000);

        while (true) {
            try {
                BankAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());

                int balance = (int) bankAccount.getAmount();
                try {
                    bankAccount.withDraw(balance);
                } catch (LimitException limitException) {
                    limitException.printStackTrace();
                }

                break;
            }
        }

    }
}