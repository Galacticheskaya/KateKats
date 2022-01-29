import java.util.Scanner;

public class FirstApp {
    private static Scanner sc;

    public static void main (String[] args) {
        System.out.println("Ja molodec!");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign(){
        int a=2;
        int b=3;
        if (a+b>=0) {
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отрицательная");
        }
    }

    private static void printColor(){
        int value=3;
        if (value<=0) {
            System.out.println("красный");
        }if (value>0&&value<=100) {
            System.out.println("желтый");
        }if (value>100) {
            System.out.println("зеленый");
        }
    }
    private static void compareNumbers(){
        int a=8;
        int b=2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}

