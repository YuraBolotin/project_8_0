package com.bolotin;

import java.time.LocalDate;

public class Main {
    public  static void checkLeapYear(int year) {
        if (year % 400 == 0) {
                  System.out.println(year + " год является високосным");
        }   else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }


    }

    public  static void clientDeviceYear (int clientDeviceYear, String osName) {
        if (osName.equals("iOS") && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (osName.equals("iOS") && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (osName.equals("Android") && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }


    public  static void deliveryDistance (int deliveryDistance) {

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else {
            System.out.println("Потребуется дней: " + 3);
        }

    }

    public  static  void checkDouble (String sort) {
        char[] arr = sort.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                break;
            } else if (arr[i] == arr[i + 1]) {
                System.out.println("Обнаружен дубль " + arr[i] + arr[i + 1]);
                break;
            } else if (i < arr.length - 2){
                continue;
            } else {
                System.out.println("Дубли не обноружены");
            }
        }
    }

    public static void reverseNunber (int[] arr) {

        for (int i = arr.length - 1;  i >= 0; i--) {

            System.out.print(arr[i]);
        }
    }

    public static void main (String [] args) {
//        задание 1
        System.out.println("задание 1");

        int year = 2022;
        checkLeapYear(year);

//        задание 2
        System.out.println("задание 2");

        int currentYear = LocalDate.now().getYear();
        String osName = "iOS";
        String osName2 = "Android";

        clientDeviceYear(currentYear, osName2);

        //        задание 3
        System.out.println("задание 3");

        deliveryDistance (95);

//        задание 4
        System.out.println("Задание 4");

        String sort = "aabccddefgghiijjkk";
        checkDouble (sort);

        //        задание 5
        System.out.println("Задание 5");

        int[] arr = {3, 2, 1, 6, 5};
        reverseNunber(arr);


    }
}
