package com.company;

public class DiscountCounter {

    public static void main(String[] args) {

       int[] counters = new int[101];



        for (int vipCounter = 0; vipCounter < 2; vipCounter++) {

            for (int age = 16; age < 81; age++) {

                int discount = Discount.getDiscount(age, !(vipCounter == 0));

                counters[discount] = counters[discount] +1;

            }
        }
        for ( int i = 0; i < counters.length; i++)
        {
            if (counters[i] != 0)
            {
                System.out.println("counters[" + i + "] = " + counters[i]);
            }


        }

    }

}