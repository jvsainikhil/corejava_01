package java_basictoadvance_arrays;

public class JaggedArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a jagged array
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[] {1, 2, 3};
        jaggedArray[1] = new int[] {4, 5};
        jaggedArray[2] = new int[] {6, 7, 8, 9};

        // Print the jagged array
        System.out.println("JaggedArray:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // Another jagged array with uninitialized values
        int[][] nums = new int[3][];
        nums[0] = new int[1];
        nums[1] = new int[2];
        nums[2] = new int[4]; // changed from 9 to 4 to keep it uniform for display

        // Fill and print the nums array with random values
        System.out.println("Randomized Jagged nums array:");
        for (int m = 0; m < nums.length; m++) {
            for (int n = 0; n < nums[m].length; n++) {
                nums[m][n] = (int)(Math.random() * 10);
                System.out.print(nums[m][n] + " ");
            }
            System.out.println();
        }
        
        int[][][] num3d = new int[3][][];
        num3d[0] = new int[1][2];
        num3d[1] = new int[2][3];
        num3d[2] = new int[4][7];

        // Loop through 3D array
        for (int i = 0; i < num3d.length; i++) {
            System.out.println("Layer " + i + ":");
            for (int j = 0; j < num3d[i].length; j++) {
                for (int k = 0; k < num3d[i][j].length; k++) {
                    num3d[i][j][k] = (int)(Math.random() * 10);
                    System.out.print(num3d[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
