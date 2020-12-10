package demo.day_1.fundamentals.conditionals.if_else;

/**
 * Created by ryandesmond - https://codingnomads.co
 */

public class IfElseDemo {

    public static void main(String[] args) {

        /* -----------------------------------------
                IF STATEMENT
        ----------------------------------------- */

        int a = 3;
        int b = 10;

        if (a > 1){
            System.out.println("a is greater than 1");
        }

        /* -----------------------------------------
                IF-ELSE STATEMENT
        ----------------------------------------- */

        if(a > 5){
            System.out.println("a is greater than 5");
        } else {
            System.out.println("a is not greater than 5");
        }

        /* -----------------------------------------
                IF-ELSE-IF-ELSE LADDER
        ----------------------------------------- */
        if(a == 1){
            System.out.println("a is 1");
        } else if (a == 2){
            System.out.println("a is 2");
        } else if (a == 3){
            System.out.println("a is 3");
        } else {
            System.out.println("a is not 1, 2 or 3");
        }
    }

}
