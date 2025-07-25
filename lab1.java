import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    char operator;
    Double numberone, numbertwo, result;


    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    System.out.println("Enter number");
    numberone = input.nextDouble();

    System.out.println("Enter second number");
    numbertwo = input.nextDouble();

    switch (operator) {

      case '+':
        result = numberone + numbertwo;
        System.out.println(numberone + " + " + numbertwo + " = " + result);
        break;

      case '-':
        result = numberone - numbertwo;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      case '*':
        result = numberone * numbertwo;
        System.out.println(numberone + " * " + numbertwo + " = " + result);
        break;

      case '/':
        result = numberone / numbertwo;
        System.out.println(numberone + " / " + numbertwo + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!!!");
        break;
    }
    System.out.println("Thank for testing");
    //Thank you
    

    input.close();
  }
}