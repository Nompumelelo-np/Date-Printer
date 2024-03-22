/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dateprinter;
import java.util.Date;
/**
 *
 * @author Acer-User
 */





public class Util {
    class DatePrinter {
    public void printDate() {
        Date today = new Date();
        System.out.println("Today's date is: " + today);
    }
}

    public static void main(String[] args) {
        
      
        DatePrinter datePrinter = new DatePrinter();
        datePrinter.printDate();

  
        DatePrinter anonymousDatePrinter = new DatePrinter() {
            @Override
            public void printDate() {
                Date today = new Date();
                System.out.println("Overridden date printing: " + today);
            }
        };
        anonymousDatePrinter.printDate();
    }
}


