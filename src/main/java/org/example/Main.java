package org.example;
import java.lang.Math;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dice Roller");
        System.out.print("Roll the dice (y/n): ");
        String rollCondtion = sc.nextLine();
        while(rollCondtion.equalsIgnoreCase("y") )
        {
            int die1 = rollDie();
            int die2 = rollDie();
            rollCondtion = evaluateDie(die1, die2, sc);
        }

    }
    private static int rollDie()
    {
        return (int) (Math.random()* 6)+ 1;
    }
    private static String evaluateDie(int num1, int num2, Scanner sc)
    {
        if (num1 + num2 == 2)
        {
            System.out.printf("\nDie 1: %d\nDie 2: %d\n", num1,num2);
            System.out.println("Total: "+ (num1+num2));
            System.out.println("Snake Eyes!\n");
        }
        else if (num1 + num2 == 12)
        {
            System.out.printf("\nDie 1: %d\nDie 2: %d\n", num1,num2);
            System.out.println("Total: "+ (num1+num2));
            System.out.println("Boxcars!\n");
        }
        else
        {
            System.out.printf("\nDie 1: %d\nDie 2: %d\n", num1,num2);
            System.out.println("Total: "+ (num1+num2)+"\n");
        }
        System.out.print("Roll again? (y/n): ");
        return sc.nextLine();
    }
}
