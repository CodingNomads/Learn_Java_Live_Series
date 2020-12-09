package demo.day_1.arrays;

/**
 * Created by ryandesmond - https://codingnomads.co
 */

public class ArrayDemo {
    public static void main(String[] args) {
        /* -----------------------------------------
                Simple Array
        ----------------------------------------- */

        int[] nums = new int[5];
        nums[0] = 123;
        nums[1] = 456;
        nums[2] = 987;
        nums[3] = 654;
        nums[4] = 56;

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            System.out.println(num);
        }

        // for-each loop can only be used with a collection
        for(int n : nums){
            System.out.println(n);
        }

        /* -----------------------------------------
                2-Dimension Array
        ----------------------------------------- */

        int[][] num2D = new int[3][4];

        /*
                0 1 2 3 4
                1 2 3 4 5
                2 3 4 5 6
         */
        for(int i = 0; i < num2D.length; i++){
            for(int j = 0; j < num2D[i].length; j++){
                num2D[i][j] = i * j;
            }
        }

        System.out.println();

        // for each loop over 2D array
        for(int[] numbers : num2D){
            for(int n : numbers){
                System.out.print(n + "-");
            }
            System.out.println();
        }

        /* -----------------------------------------
                For-Each Loop
        ----------------------------------------- */
    }

}
