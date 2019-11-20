// warunkowe, petle mozna od 4 zaczac, do losowanie, ostatnia z losowania wymaga wiecej czasu
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ex1();
        ex12();
    }

    private static void ex1() {
        System.out.print("Give me radius: ");
        Scanner read = new Scanner(System.in);
        int radius = read.nextInt();
        System.out.println(radius * 3.14);
    }

    private static void ex2() {
        System.out.print("Enter first number: ");
        Scanner read = new Scanner(System.in);
        int first_number = read.nextInt();
        System.out.print("Enter second number: ");
        int second_number = read.nextInt();
        System.out.print(first_number * second_number);
    }

    private static void ex3() {
        System.out.print("Enter your age: ");
        Scanner read = new Scanner(System.in);
        int age = read.nextInt();
        if (age < 18) System.out.println("You can\'t vote.");
        if (age >= 18 && age < 35) System.out.println("You can vote, but you can\'t be elected president.");
        if (age >= 35) System.out.println("You can be elected president");
    }
//Poprawic na ladniejszy jak starczy czasu, to da sie zrobic lepiej
    private static void ex4() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter 3 numbers separated by enter");
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        if (a < b && b < c) System.out.print("" + a + b + c);
        if (a < c && c < b) System.out.print("" + a + c + b);
        if (b < a && a < c) System.out.print("" + b + a + c);
        if (b < c && c < a) System.out.print("" + b + c + a);
        if (c < a && a < b) System.out.print("" + c + a + b);
        if (c < b && b < a) System.out.print("" + c + b + a);
    }

    private static void ex5() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter 3 sides of triangle separated by enter");
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        if (a+b>c && a+c>b && b+c>a) System.out.println("You can build a triangle.");
        else System.out.println("You can\'t build a triangle.");
    }

    private static void ex6() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter 3 sides of triangle separated by enter");
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        if ((a*a+b*b)==c*c || (a*a+c*c)==b*b || (b*b+c*c)==a*a) System.out.println("The triangle is right-angled.");
        else System.out.println("The triangle is not right-angled.");
    }

    private static void ex7() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a, b and c of exuasion: ax^2 + bx + c");
        double a = read.nextInt();
        double b = read.nextInt();
        double c = read.nextInt();
        double x1, x2;
        double delta = (b*b) - (4*a*c);
        double delta_squared = Math.sqrt(delta);
        if (delta > 0){
        x1 = ((-(b) - delta_squared)/(2*a));
        x2 = ((-(b) + delta_squared)/(2*a));
        System.out.print("" + x1 + x2);
        }
        if (delta == 0){
            double x = -(b/(2*a));
            System.out.print("" + x);
        }
    }

    //LOOPS

    private static void ex8() {
        System.out.println("Dividable by 3: ");
        for(int i = 1; i<=100; i++){
            if (i % 3 == 0) System.out.println(i);
        }
        System.out.println("Dividable by 5: ");
        for(int i = 1; i<=100; i++){
            if (i % 5 == 0) System.out.println(i);
        }
        System.out.println("Dividable by 3 and 5: ");
        for(int i = 1; i<=100; i++){
            if (i % 3 == 0 && i % 5 == 0) System.out.println(i);
        }
        System.out.println("Dividable by 3 or 5: ");
        for(int i = 1; i<=100; i++){
            if (i % 3 == 0 || i % 5 == 0) System.out.println(i);
        }

    }
    //Wyświetl liczby w pętli z przedziału podanego przez użytkownika (operujemy na liczbach całkowitych)
    private static void ex9() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the beggining and the end of the range separated by enter");
        int a = read.nextInt();
        int b = read.nextInt();
        int beggining = 0;
        int end = 0;
        if (a < b) {
            beggining = a;
            end = b;
        } else {
            beggining = b;
            end = a;
        }

        for (int i = beggining; i <= end; i++){
            System.out.println(i);
        }

    }
    //Wrzucic do tablicy pozniej
    private static void ex10() {
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.print(i*j);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
//Wyświetl kolejne elementy ciągu Fibonacciego.
    private static void ex11(int n){
        long a = 1;
        long b = 1;
        System.out.print(1 + "\t");
        for (int i = 0; i <= n-2; i++) {
            System.out.print(b + "\t");
            b += a;
            a = b - a;
        }
    }

    public static void extra() {
        for(int i = 1; i<=100; i++){
            System.out.println(" ");
            boolean divtwo = (i % 2 == 0);
            boolean divthree = (i % 3 == 0);
            while(divtwo || divthree) {
                if (divtwo) {
                    System.out.print("podzielne przez 2");
                    while (divthree) {
                        System.out.print(" podzielne przez 3");
                        break;
                    }
                }
                if (divthree && !divtwo) {
                    System.out.print("podzielne przez 3");
                }
                break;
            }
            while(!divtwo && !divthree) {
                System.out.print(i);
                break;
            }
        }
    }
//Wylosuj liczbę z podanego zakresu i wyświetl ją (zakres min i max wpisuje użytkownik). -- niedokończone
    public static void ex12() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter beggining and end of range");
        int a = read.nextInt();
        int b = read.nextInt();
        int beggining, end;
        if (a < b) {
            beggining = a;
            end = b;
        } else {
            beggining = b;
            end = a;
        }
        int range = end - beggining + 1;
        for(int i = beggining; i <= range; i++) {
            int rand = (int)(Math.random() * range) + beggining;
        }
        System.out.print(rand);
    }
}