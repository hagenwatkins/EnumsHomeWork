package com.tiy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("please pick a month");
        for(Month month: Month.values()) {
            System.out.println("MONTH "+month);
            System.out.println("ORDINAL"+month.ordinal());
        }
            System.out.println("please pick a month");
            String monthInput = scanner.nextLine();

            Month selectedMonth = Month.valueOf(monthInput.toUpperCase());

            System.out.println(selectedMonth +" "+ selectedMonth.ordinal());

            for(Month month: Month.values()){
                if(month.ordinal() > selectedMonth.ordinal()){
                    System.out.println("months after selected month.= "+ month);
                }
            }
        }

}

