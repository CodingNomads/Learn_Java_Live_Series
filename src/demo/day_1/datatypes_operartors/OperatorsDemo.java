package demo.day_1.datatypes_operartors;

/**
 * Created by ryandesmond - https://codingnomads.co
 */

public class OperatorsDemo {

    public static void main(String[] args) {

        /* -------------------------------------------------
                ARITHMETIC OPERATORS (+, -, *, /, %)
        ---------------------------------------------------- */
        int a = 10;
        int b = 20;
        int c = 24;
        int sum = a + b;
        int result = b - a;
        int mult = a * b;
        int divide = b / a;
        int mod = c % a;
        System.out.println(sum + " - " + result + " - " + mult + " - " + divide + " - " + mod);

        /* -------------------------------------------------
                RELATIONAL OPERATORS (>, >=, <, <=, ==, !=)
        ---------------------------------------------------- */
        if (a > b){
            System.out.println("a is greater than b");
        }
        if (a >= b){
            System.out.println("a is greater or equal to b");
        }
        if (a <= b){
            System.out.println("a is less than or equal to b");
        }
        if (a == b){
            System.out.println("a and b are equal");
        }
        if(a != b){
            System.out.println("a and b are not equal");
        }


        /* -------------------------------------------------
                LOGICAL OPERATORS (&, &&, |, ||, !, ^)
        ---------------------------------------------------- */

        if (a > 5 & b < 30){
            System.out.println("a is greater than 5 and b is less than 30");
        }
        if (a > 5 && b < 30){
            System.out.println("a is greater than 5 and b is less than 30");
        }
        if (a > 5 | b < 5){
            System.out.println("a is greater than 5 OR b is less than 5");
        }
        if (a > 5 || b < 5){
            System.out.println("a is greater than 5 OR b is less than 5");
        }

        boolean test = false;

        if (!test){
            System.out.println("test is false");
        }
        if(a > 5 ^ b > 30){
            System.out.println("a is greater than 5 XOR b > 30");
        }
    }

}
