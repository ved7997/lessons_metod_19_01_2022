package ru.skypro;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //Задание №1

        visocos(1980);

        //Задание №2

        operatingSystem(2002, 1);
//        int clientOS = 0;
//        int clientDeviceYear = 2021;
//        int currentYear = LocalDate.now().getYear();
//        if (clientDeviceYear == currentYear) {
//
//            if (clientOS == 1) {
//                System.out.println("Установите версию приложения для Android по ссылке");
//
//            } else if (clientOS == 0) {
//                System.out.println("Установите версию приложения для iOS по ссылке");
//
//            }
//
//        }
//        String ios = "Установите облегченную версию приложения для iOS по ссылке";
//        String android = "Установите облегченную версию приложения для Android по ссылке";
//
//        if (clientDeviceYear < currentYear) {
//
//            if (clientOS == 1) {
//                System.out.println(android);
//            } else if (clientOS == 0) {
//                System.out.println(ios);
//            }
//        }
    }

    public static int visocos(int year) {
        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным ");
            return year;
        } else {
            System.out.println(year + " год не является високосным ");
            return year;
        }
    }


    public static String operatingSystem(int clientDeviceYear, int clientOS) {


        //int clientOS = ;
        //int clientDeviceYear = 2021;
        String stro7;
        String stro1 = "Установите версию приложения для Android по ссылке";
        String stro2 = "Установите версию приложения для iOS по ссылке";
        String stro3 = "Установите облегченную версию приложения для iOS по ссылке";;
        String stro4 = "Установите облегченную версию приложения для Android по ссылке";;
        //System.out.println(stro7);

        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear == currentYear) {

            if (clientOS == 1) {
                //String stro1 = "Установите версию приложения для Android по ссылке";
                stro7 = stro1;
                System.out.println(stro7);
                return stro7;

                //System.out.println(stro1);

            } else if (clientOS == 0) {
                //String stro2 = "Установите версию приложения для iOS по ссылке";
//                System.out.println(stro2);
//                return stro2;
                stro7 = stro2;
                System.out.println(stro7);
                return stro7;
            }

        }
//        String ios = "Установите облегченную версию приложения для iOS по ссылке";
//        String android = "Установите облегченную версию приложения для Android по ссылке";

        if (clientDeviceYear < currentYear) {

            if (clientOS == 1) {
                stro7 = stro3;
                System.out.println(stro7);
                return stro7;

            } else if (clientOS == 0) {
               // System.out.println(ios);
                stro7 = stro4;
                System.out.println(stro7);


            }


        }






    }



}
