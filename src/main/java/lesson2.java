/**
 * Java 1. HomeWork-1
 * @autor Kate Kats
 * @version 29.01.22
 */

public class lesson2 {
    public static void main (String[] args) {
        System.out.println(task1(11,3));
        task2(2);
        System.out.println(task3(4));
        task4("davai", 3);
        System.out.println(task5(1234));
    }

    static boolean task1(int a, int b) {
        if (a+b>=10&&a+b<=20)
            return true;
        else
            return false;
    }

    static void task2(int a){
        if (a>=0)
            System.out.println("положительная");
        else System.out.println("отрицательная");
    }

    static boolean task3(int b){
        if (b<0)
            return true;
        else return false;
    }

    static void task4(String semen, int kolichestvoStrokKootoroeNamNada){
       for (int senya=0;senya<kolichestvoStrokKootoroeNamNada;senya++){
           System.out.println(semen);
       }
    }

    static boolean task5(int god){
        if (god%400==0)
            return true;
        if (god%4==0&&god%100>0)
            return true;
        else return false;
    }
}

