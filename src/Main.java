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
    }
}