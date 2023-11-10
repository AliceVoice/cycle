public class Main {
    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6();
        zad7();
        zad8();
        zad9();
        zad10();
    }

    public static void zad1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void zad2() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void zad3() {
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void zad4() {
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void zad5() {
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void zad6() {
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void zad7() {
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void zad8() {
        int salary = 29_000;
        int total = 0;
        for (int month = 0; month <= 12; month++) {
            total = total + salary;
            System.out.println(total);
        }
    }

    public static void zad9() {
        int salary = 29_000;
        int total = 0;
        for (int month = 0; month <= 12; month++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void zad10() {
        int i = 2;
        for (int u = 1; u <= 10; u++) {
            System.out.println(i + " * " + u + " = " + i * u);
        }
    }
}

