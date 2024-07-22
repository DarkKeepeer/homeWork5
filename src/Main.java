public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        int year = 2021;
        if (year % 4 == 0 && year % 100 == 00 && year % 400 == 00) {
            System.out.println("Год високосный");
        } else if (year % 4 == 0 && year % 100 == 0) {
            System.out.println("Год не високосный");
        } else if (year % 4 == 0 && year % 400 == 0) {
            System.out.println("Год високосный");
        } else if (year % 4 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
        int deliveryDistance = 95;
        int deliveryTime1 = 1;
        int deliveryTime2 = deliveryTime1 + 1;
        int deliveryTime3 = deliveryTime2 + 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("Потребуется дней: " + deliveryTime2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("Потребуется дней: " + deliveryTime3);
        } else if (deliveryDistance > 100) {
            System.out.println("Вы находитесь вне зоны доставки.");
        }
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сезон зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон осень");
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}

