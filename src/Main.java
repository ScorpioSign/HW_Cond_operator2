public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();

    }
    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 0;
        if(clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if(clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else{
            System.out.println("Некорректный ввод");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2016;
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else {
                System.out.println("Некорректный ввод");
            }
                }

    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2024;
        if( year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("Год високосный");
        }else{
            System.out.println("Год невисокосный");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: 1");
        }else if(deliveryDistance > 20 && deliveryDistance <= 60 ){
            System.out.println("Потребуется дней: 2");
        }else if(deliveryDistance > 60 && deliveryDistance <= 100 ){
            System.out.println("Потребуется дней: 3");
        }else {
            System.out.println("Доставки нет");
        }

    }
    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " - зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " - весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " - летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " - осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
                break;
        }
    }
}