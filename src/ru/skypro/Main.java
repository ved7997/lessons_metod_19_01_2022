package ru.skypro;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
                //Задание №1

        visocos(1999);

                //Задание №2

        operatingSystem(2002, 1);

    }

    public static int visocos(int year ) {
        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
           System.out.println(year + " год является високосным ");
            return year;
        } else {
         System.out.println(year + " год не является високосным ");
                return year;
        }

    }

    public static int operatingSystem(int clientDeviceYear, int clientOS ){
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear >= currentYear) {

            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
              // return clientDeviceYear;
              // return clientOS;
            } else if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
               // return clientDeviceYear;
                //return clientOS;
            }
            //return clientDeviceYear;
            return clientOS;
        }

        if (clientDeviceYear < currentYear) {

            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
               // return clientDeviceYear;
                //return clientOS;
            } else if (clientOS == 0) {
              System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                //return clientDeviceYear;
                //return clientOS;
            }
            //return clientDeviceYear;
           return clientOS;
        }

    }

}
