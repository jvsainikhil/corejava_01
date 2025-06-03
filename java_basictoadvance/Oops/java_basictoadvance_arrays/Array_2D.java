package java_basictoadvance_arrays;

public class Array_2D {
	public static void main(String[] args) {
		//int i=3,j=6,k=4; // if we want to store bunch of values we use array
		//int num[] = {1,3,3,2,21};
		int nums[][] = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++){
				nums[i][j]=(int)(Math.random() * 10);
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++){
				nums[i][j]=(int)(Math.random() * 1000);
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int[] row : nums) {
			for(int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		int size = 4; // 4x4 matrix
        int[][] square = new int[size][size];
        
        int count = 1;
        System.out.println("Sequential Square 2D Array:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                square[i][j] = count++;
                System.out.print(square[i][j] + "\t");
            }
            System.out.println();
        }
	}
}
