package ru.skypro;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //Задание №1

        visocos(1980);

        //Задание №2

        operatingSystem(2022, 0);

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


    public static void operatingSystem(int clientDeviceYear, int clientOS) {

        String stro1 = "Установите версию приложения для Android по ссылке";
        String stro2 = "Установите версию приложения для iOS по ссылке";
        String stro3 = "Установите облегченную версию приложения для iOS по ссылке";
        String stro4 = "Установите облегченную версию приложения для Android по ссылке";

        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear == currentYear) {
            if (clientOS == 1) {
                System.out.println(stro1);

            } else if (clientOS == 0) {

               System.out.println(stro2);

            }

        }

        else if (clientDeviceYear < currentYear) {

            if (clientOS == 1) {
                System.out.println(stro4);

            } else if (clientOS == 0) {
                System.out.println(stro3);

            }


        }


    }

}







