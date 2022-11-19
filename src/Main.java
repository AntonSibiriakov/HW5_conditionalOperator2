public class Main {
    public static void main(String[] args) {
        //Задание №1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задание №2
        int clientOS0 = 1;
        int clientDeviceYear = 2015;
        if (clientOS0 == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS0 == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        //Задание №3
        int year = 2021;
        if (year % 100 == 0 || year % 4 == 0 && year % 400 != 0) {
            System.out.println("год является високосным");
        }
        else System.out.println("год не является високосным");

        //Задание №4
        int deliveryDistance = 95;
        if ( deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }

        //Задание №5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
            case 2:
                System.out.println("Зима");
            case 3:
                System.out.println("Весна");
            case 4:
                System.out.println("Весна");
            case 5:
                System.out.println("Весна");
            case 6:
                System.out.println("Лето");
            case 7:
                System.out.println("Лето");
            case 8:
                System.out.println("Лето");
            case 9:
                System.out.println("Осень");
            case 10:
                System.out.println("Осень");
            case 11:
                System.out.println("Осень");
            case 12:
                System.out.println("Зима");
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}