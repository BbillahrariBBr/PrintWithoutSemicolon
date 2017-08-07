/*
* program Odd even without If-Else
*
*
* */

import java.util.Scanner;

class Even_Odd_Without_IfElse {
    // TODO: 8/7/2017
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");

        int number = input.nextInt();

        switch (number%2){
            case 0:
                System.out.println(number + " Number is Even ..");
                break;
            case 1:
                System.out.println(number+ " Number is Odd .. ");
                break;
        }
    }
}