public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1(){
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++){
            System.out.println("Число: "+ i);
        }
        System.out.println();
    }

    public static void task2(){
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i= i-1){
            System.out.println("Число: " + i);
        }
        System.out.println();
    }

    public static void task3(){
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2){
            System.out.println("Число: " + i);
        }
        System.out.println();
    }

    public static void task4(){
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 2){
            System.out.println("Число: " + i);
        }
        System.out.println();
    }

    public static void task5(){
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " год является високосным");
        }
        System.out.println();
    }

    public static void task6(){
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7){
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task7(){
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2){
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task8(){
        System.out.println("Задача 8");
        int accumulation = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
    }

    public static void task9(){
        System.out.println("Задача 9");
        int accumulation = 29000;
        int total = 0;
        int accumulationProcent = accumulation * 100;
        int totalAccumulation = 0;
        for (int i = 0; i <= 12; i++) {
            totalAccumulation = totalAccumulation + totalAccumulation / 100;
            totalAccumulation = totalAccumulation + accumulationProcent;
            total = totalAccumulation / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalAccumulation + " рублей");
        }
        System.out.println();
    }

    public static void task10(){
        System.out.println("Задача 10");
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            int totalNumber = number * i;
            System.out.println(number + " * " + i + " = " + totalNumber);
        }
    }
}

