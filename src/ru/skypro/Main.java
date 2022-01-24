package ru.skypro;

import java.time.LocalDate;

//import static jdk.internal.org.jline.utils.Colors.s;

public class Main {


    public static void main(String[] args) {
        //Задание №1

        visocos(2000);

        //Задание №2

        operatingSystem(2022, 0);

        //Задание №3

        deliveryTime(19);
        //Задание 4
       sortStro ("aabccddefgghiijjkk");

        //Задание 5


         reverseArray("32165");


    }

    public static int visocos(int year) {
        if ( year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ) {
            System.out.println(year + " год  является високосным ");
            return year;
        }else  {
            System.out.println(year + " год не является високосным ");

        }
        return year;
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

        } else if (clientDeviceYear < currentYear) {

            if (clientOS == 1) {
                System.out.println(stro4);

            } else if (clientOS == 0) {
                System.out.println(stro3);
            }
        }
    }

    public static int deliveryTime(int deliveryDistance) {
        //int deliveryDistance = 95;
        int day = 0;
        if (deliveryDistance <= 20) {
            day = 1;
            System.out.println("Потребуется дней: " + day);

        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            day = 2;
            System.out.println("Потребуется дней: " + day);

        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            day = 3;
            System.out.println("Потребуется дней: " + day);

        }
        return day;
    }
    public static void reverseArray(String s){

      char[] reverseFull = s.toCharArray();
      int i;

        for (i = reverseFull.length - 1; i >= 0; i--) {

            System.out.print(reverseFull[i]);
       }

    }

    public static void sortStro(String st) {
        char[] sortChar = st.toCharArray();
        char rezult = ' ';
        for (int i = 0; i < sortChar.length; i++) {

            if (sortChar[i] == rezult) {
                System.out.println("Присутствует дубль " + sortChar[i]);
                break;
            }
            rezult = sortChar[i];
        }
    }

}







