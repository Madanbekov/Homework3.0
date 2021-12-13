package com.company;

public class BankAccount {
    private static double amount;

    public static double getAmount() {
        return amount;
    }


    public static void deposit(double money) {
        amount += money;
        System.out.println("Ваш депозит: " + money + " сом.");
        System.out.println("На вашей карте : " + getAmount());
    }

    public static void withDraw(int money) throws LimitException {
        if (money > amount) {
            throw new LimitException("Вы не можете снять наличные, так как у вас недостаточно средств ", amount);
        } else {
            amount -= money;
            System.out.println("----------------------------");
            System.out.println("Вы сняли: " + money + " Остаток на вашей карте: " + getAmount());
            System.out.println("----------------------------");

        }
    }
}
