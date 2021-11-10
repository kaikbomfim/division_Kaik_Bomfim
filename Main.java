/*This program is to do a division between two numbers*/

import java.util.Scanner;

class Main{
  public static void main (String [] args){

    float number1, number2, division;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Informe o dividendo: ");
    number1 = keyboard.nextFloat();

    System.out.print("Informe o divisor: ");
    number2 = keyboard.nextFloat();

    division = number1 / number2;
    System.out.println("A divisão entre os dois números é: " + division);

  }
}