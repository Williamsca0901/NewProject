package com.company.class21;

public class CreditCardTester {
    public static void main(String []args) {

        CreditCard creditCard = new CreditCard(100);
        creditCard.calculateInterest();

        Visa visa = new Visa(300);
        visa.calculateInterest();

        AX ax = new AX(200);
        ax.calculateInterest();
    }




    }

