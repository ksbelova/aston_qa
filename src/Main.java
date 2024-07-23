public class Main {
    public static void main(String[] args) {
        printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();
        //System.out.println(checkSum (5,10));
        //checkNumber (10);
        //System.out.println(checkNumberNegative (0));
        //stringAndNumber ("qwerty", 5);
        //System.out.println(leapYear(2024));
        //invertArray ();
        //fillingArray ();
        //multiplyingNumberSix ();
        //squareArray ();
        //oneArray (5, 10);
    }

    //заданий 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //задание 2
    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //задание 3
    public static void printColor() {
        int value = 170;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    //задание 4
    public static void compareNumbers() {
        int a = 15;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //задание 5
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    //задание 6
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //задание 7
    public static boolean checkNumberNegative(int number) {
        return number < 0;
    }

    //задание 8
    public static void stringAndNumber(String str, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
    }

    //задание 9
    public static boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }

    //задание 10
    public static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            // Замена 0 на 1 и 1 на 0
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    //задание 11
    public static void fillingArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    //задание 12
    public static void multiplyingNumberSix() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    //задание 13
    public static void squareArray() {
        int size = 3;
        int[][] array = new int[size][size];
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //задание 14
    public static void oneArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}