package demo.day_1.fundamentals.conditionals.loops;

/**
 * Created by ryandesmond - https://codingnomads.co
 */

public class LoopsDemo {

    public static void main(String[] args) {

        /* look into te following keywords:
                * continue (forces an early iteration of the loop)
                * break (break out of the nearest loop)
                * return (break out of the current method
         */

        /* -----------------------------------------------
                WHILE LOOP (indefinite iteration)
        -------------------------------------------------- */
        int i = 10;

        while(i >= 0){
            System.out.print(i + "-");
            i--;
        }
        System.out.println();

        /* -----------------------------------------------
                DO-WHILE LOOP (execute loop at least once)
        -------------------------------------------------- */
        int z = 0;

        do {
            System.out.print(z + "-");
            z++;
        } while(z <= 5);

        System.out.println();
        /* -----------------------------------------------
                FOR LOOP (finite iteration)
        -------------------------------------------------- */

        for(int c = 1000; c > 0; c -= 3){
            System.out.println(c);
        }

        // for(initialization; boolean condition; iteration)

        /* -----------------------------------------------
                FOR-EACH LOOP (visit each element in a collection)

                * See "ArrayDemo.java"

        -------------------------------------------------- */


    }

}
