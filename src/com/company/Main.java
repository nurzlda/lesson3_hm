package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        while (true)
           try {
               bankAccount.withDraw(6000);
           } catch (LimitException limitException){
               System.out.println( limitException.getMessage());
               try {
                   bankAccount.withDraw(6000);
               } catch (LimitException limitException1){
                   System.out.println("У вас остаток: " + limitException.getRemainingAmount());
               }

               break;
           }
        }
    }

