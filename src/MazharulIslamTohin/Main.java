/*
Name    : Mazharul Islam Tohin
ID      : 2012020190
Section : 5(D)
Email   : cse_2012020190@lus.ac.bd
Date    : 12-07-2021
 */


package MazharulIslamTohin;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String section;
        section = input.nextLine();
        Info  x   = new Info();
        Hobby y   = new Hobby();
        System.out.println(x.name);
        System.out.println(x.id);
        System.out.println(section);
        System.out.println(y.hobbyName);


    }
}