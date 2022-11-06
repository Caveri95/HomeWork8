public class Main {
    public static void main(String[] args) {
        System.out.println("--");
        System.out.println("ЗАДАЧА 1");

        int salary = 15000;
        int total = 0;
        int month = 0;

        while (total < 2_495_000) {
            total = total + salary;
            month = month + 1;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + total);

        System.out.println("--");
        System.out.println("ЗАДАЧА 2");

        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }

        System.out.println("--");
        System.out.println("ЗАДАЧА 3");


        for (int a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }

        System.out.println("--");
        System.out.println("ЗАДАЧА 4");

        double people = 12_000_00;
        float birthOn1000 = 17/100F;
        float  deathOn1000 = 8/100F;
        int year = 0;
        while (year < 10) {
            year++;
            people = people + people * birthOn1000 - people * deathOn1000;
            System.out.println("Год " + year + ", численность населения составляет " + people);
        }

        System.out.println("--");
        System.out.println("ЗАДАЧА 4, 5");

        double contribution = 15000;
        for (int n = 0; contribution < 12_000_000; n++) {
            contribution = contribution + contribution*0.07;
            if (n % 6 == 0) {
                System.out.println("В " + n + " месяце сумма накоплений составляет " + contribution);
            }
        }

        System.out.println("--");
        System.out.println("ЗАДАЧА 6");

        double bank = 15000;
        for (int m = 0; m < 108; m++) {
            bank = bank + bank*0.07;
            if (m % 6 == 0) {
                System.out.println("В " + m + " месяце сумма накоплений составляет " + bank);
            }

        }

        System.out.println("--");
        System.out.println("ЗАДАЧА 7");

        int friday = 3;
        while (friday <= 31){
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;


        }

        System.out.println("--");
        System.out.println("ЗАДАЧА 8");


        int nowYear = 2022;
        int beforeNowYear = nowYear - 200;
        int afterNowYear = nowYear + 100;

        for (int years = 0; years < afterNowYear; years += 79) {
            if (years > beforeNowYear) {
                System.out.println(years);
            }

        }




        System.out.println("--");
        System.out.println("ЗАДАЧА 9");

        for (int x = 1; x <= 10; x++) {
            int a = 2 * x;
            System.out.println("2 * " + x + " = " + a);

        }









    }
}