package com.company;
import java.util.Scanner;

public class calculator {

    public int number1;
    public int number2;
    public String sign;
    public int ans;

    public void Calculator(){
        Scanner num1 = new Scanner(System.in);
        System.out.print("type first number: ");
        number1 = num1.nextInt();

        Scanner operator = new Scanner(System.in);
        System.out.print("Input a sign ");
        sign = operator.nextLine();

        Scanner num2 = new Scanner(System.in);
        System.out.print("type second number: ");
        number2 = num2.nextInt();

        try{
        switch (sign){
            case "+":
                ans = number1 + number2;
                break;
            case "-":
                ans = number1 - number2;
                break;
            case "/":
                ans = number1 / number2;
                break;
            case "*":
                ans = number1 * number2;
                break;
        }
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
        try {
            if(sign != "+" || sign != "-"|| sign != "/"|| sign != "*")
            {
                throw new WrongMathOperationException();
            }

        }catch (WrongMathOperationException e){
           System.out.println("Error -> WrongMathOperationException");
        }
        System.out.println("Answer is -> " + number1 + sign + number2 + "=" + ans);


    }
}
