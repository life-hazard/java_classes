// warunkowe, petle mozna od 4 zaczac, do losowanie, ostatnia z losowania wymaga wiecej czasu
package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

import java.util.Set;
import java.util.HashSet;

import java.util.Arrays;
import java.util.*;
import java.io.*;
import java.net.*;

public class Main {

    public static void main(String[] args) throws IOException {
       ex14();
        //unique_2();
        //extra();
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
        if (a + b > c && a + c > b && b + c > a) System.out.println("You can build a triangle.");
        else System.out.println("You can\'t build a triangle.");
    }

    private static void ex6() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter 3 sides of triangle separated by enter");
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        if ((a * a + b * b) == c * c || (a * a + c * c) == b * b || (b * b + c * c) == a * a)
            System.out.println("The triangle is right-angled.");
        else System.out.println("The triangle is not right-angled.");
    }

    private static void ex7() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a, b and c of exuasion: ax^2 + bx + c");
        double a = read.nextInt();
        double b = read.nextInt();
        double c = read.nextInt();
        double x1, x2;
        double delta = (b * b) - (4 * a * c);
        double delta_squared = Math.sqrt(delta);
        if (delta > 0) {
            x1 = ((-(b) - delta_squared) / (2 * a));
            x2 = ((-(b) + delta_squared) / (2 * a));
            System.out.print("" + x1 + x2);
        }
        if (delta == 0) {
            double x = -(b / (2 * a));
            System.out.print("" + x);
        }
    }

    //LOOPS

    private static void ex8() {
        System.out.println("Dividable by 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) System.out.println(i);
        }
        System.out.println("Dividable by 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) System.out.println(i);
        }
        System.out.println("Dividable by 3 and 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println(i);
        }
        System.out.println("Dividable by 3 or 5: ");
        for (int i = 1; i <= 100; i++) {
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

        for (int i = beggining; i <= end; i++) {
            System.out.println(i);
        }

    }

    private static void ex10() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }

    private static void ex11(int n) {
        long a = 1;
        long b = 1;
        System.out.print(1 + "\t");
        for (int i = 0; i <= n - 2; i++) {
            System.out.print(b + "\t");
            b += a;
            a = b - a;
        }
    }

    public static void extra() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(" ");
            boolean divtwo = (i % 2 == 0);
            boolean divthree = (i % 3 == 0);
            while (divtwo || divthree) {
                if (divtwo) {
                    System.out.print("podzielne przez 2");
                    while (divthree) {
                        System.out.print(" i podzielne przez 3");
                        break;
                    }
                }
                if (divthree && !divtwo) {
                    System.out.print("podzielne przez 3");
                }
                break;
            }
            while (!divtwo && !divthree) {
                System.out.print(i);
                break;
            }
        }
    }


    public static void ex12() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter beginning and end of range");
        int a = read.nextInt();
        int b = read.nextInt();
        int beginning, end;
        if (a < b) {
            beginning = a;
            end = b;
        } else {
            beginning = b;
            end = a;
        }
        int range = end - beginning + 1;
        int rand = (int) (Math.random() * range) + beginning;
        System.out.print(rand);
    }


    //Napisz program,  który losuje liczbę. Użytkownik ma za zadanie odgadnąć liczbę wylosowaną przez komputer
    // z określonego zakresu.  Program ma podpowiadać “za dużo”, “za mało” lub “odgadłeś za “+liczba_prób+”razem”.

    public static void ex13(){
        int rand = (int) ((Math.random() * 9) + 1);
        int tries = 0;
        while(true){
            System.out.print("Guess a number:   ");
            Scanner read = new Scanner(System.in);
            int guess = read.nextInt();
            tries += 1;
            if (guess > rand){
                System.out.println("Too big.");
            }
            if (guess < rand){
                System.out.println("Too small.");
            }
            if (guess == rand){
                System.out.println("You\'ve guessed in " + tries + " turns.");
                break;
            }
        }
        System.out.println(rand);
    }

    //Napisz program, który losuje 6 liczb z zakresu 1..49 (używając tablic).

    public static void ex14(){
        int num[] = new int[6];
        for (int i = 0; i < 6; i++) {
            num[i] = (int) (Math.random() * 48) + 1;
            System.out.println(num[i]);
        }
    }

    //Napisz program, który losuje 6  liczb z zakresu 1..49 (używając tablic), powtórz pojedyncze losowanie w przypadku
    // gdy liczba się powtarza.

    public static void ex15(){
        int num[] = new int[6];
        int rand;
        int j = 1;
        for (int i = 0; i < 6; i++) {
            rand = (int) (Math.random() * 48) + 1;
            num[i] = rand;
            if (num[j-1] == num[j]) {
                rand = (int) (Math.random() * 48) + 1;
                num[i] = rand;
            }
            System.out.println(num[i]);
        }
    }

    //Napisz program, który losuje 6 różnych z 49 liczb (używając kolekcji) *.

    public static void ex16(){
        Set<String> rand_numbers = new HashSet<>();

    }

    // NOWE ZAJECIA

    public static void silnia() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long siln = 1;
        int num = read.nextInt();
        for (int i = num; i > 1; i--){
            siln = siln * i;
        }
        System.out.print(siln);
    }

    public static void silnia_big() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number: ");
        BigInteger silnia = new BigInteger("1");
        BigInteger num = new BigInteger("1");
        num = read.nextBigInteger();
        BigInteger i = new BigInteger("0");
        BigInteger base = new BigInteger("1");
//        for (i = num; i > base; i--){
//            silnia = silnia.multiply(i);
//        }
        System.out.print(silnia);
    }

    public static void pi_number() {
        BigDecimal pi = new BigDecimal("3.1415926535897933333");
        double pi_1 = Math.PI;
        System.out.println(pi_1);
        System.out.println(pi);
    }

    //ZAJECIA ZADANIA 2 - KOLEKCJE I BIG INTEGER

    //Napisz program, który wczyta od użytkownika dane z klawiatury do momentu wpisania słowa “koniec”,
    // które nie jest elementem zbioru/listy/tablicy czy innej struktury. Program na końcu ma wyświetlić liczbę
    // wprowadzonych elementów jak i liczbę elementów unikalnych (występujących w strukturze przechowującej
    // elementy tylko jeden raz).

    public static void unique(){
        System.out.println("Write words, to end input type \"koniec\" ");
        String end = "koniec";
        int counter = 0;
        Set<String> text = new HashSet<>();
        while (true){
            Scanner read = new Scanner(System.in);
            String words = new String();
            words = read.nextLine();
            if (words.equals(end)){
                break;
            }
            else{
                text.add(words);
                counter += 1;
            }
        }
        System.out.println("There are " + text.size() + " unique words.");
        System.out.println("you have entered " + counter + " words.");
    }

    //W pliku NAPIS.TXT, w oddzielnych wierszach, znajduje się 1 000 napisów o długościach od 2 do 25 znaków.
    // Wypisz napisy z pliku NAPIS.TXT, które występują w nim więcej niż jeden raz (każdy taki napis wypisz tylko raz).
    // [kolekcje]

    public static void text_2() throws FileNotFoundException {
        Scanner read = new Scanner(new File("NAPIS.txt"));
        String line;
        List<String> words = new ArrayList<>();
        Set<String> repeats = new HashSet<>();

        while (read.hasNextLine()){
            line = read.nextLine();
            if (words.contains(line)){
                repeats.add(line);
            }
            words.add(line);
        }
        System.out.println(repeats);
    }

    //Zmodyfikuj zadanie 1 tak by w sytuacji gdy dany element już jest w zbiorze pojawił się komunikat
    // “już jest, czy mam dodać ?” i w zależności od wyboru użytkownika została dokonana odpowiednia akcja.

    public static void unique_2(){
        System.out.println("Write words, to end input type \"koniec\" ");
        String end = "koniec";
        List<String> text_w_rep = new ArrayList<>();
        Set<String> text = new HashSet<>();
        while (true){
            Scanner read = new Scanner(System.in);
            String words = new String();
            words = read.nextLine();
            if (words.equals(end)){
                break;
            }
            else{
                if (text.contains(words)){
                    System.out.print("Already typed. Do you want to add it? [Y/N]  ");
                    String yn = new String();
                    yn = read.nextLine();
                    if (yn.equals("y")){
                        text.add(words);
                        text_w_rep.add(words);
                    }
                }
                else {
                    text.add(words);
                    text_w_rep.add(words);
                }
            }
        }
        System.out.println("There are " + text.size() + " unique words.");
        System.out.println("you have entered " + text_w_rep.size() + " words.");
    }

}
