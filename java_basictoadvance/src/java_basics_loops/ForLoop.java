package java_basics_loops;

public class ForLoop {

	public static void main(String[] args) {
		// for loop & for-each loop ---> we are writing in a same line 
		//when compared to while loop
		for(int i=4;i>=1;i--) {
			System.out.println("* "+"* "+"* "+"* "+i);
		}
		
		//all till 4 we will get as out put
		for(int j=1;j<=4;j ++) {
			System.out.println(j+" +ve");
		}
		
		//not including the 4th one --> till 3 we will get
		for(int j=1;j<4;j ++) {
			System.out.println(j+" +ve");
		}
		
		//print the number of days 24hrs
		for(int k=1;k<=9;k++) {
			System.out.println("DAY "+k);
			for(int o=1;o<=9;o++) {
				System.out.println(" "+(o+8)+" - "+(o+9));
			}
		}
		
		// another way
		int p=1;	
		for(;p<=5;) {
			System.out.println("DAY "+p);
			p++;
		}
		
		// *we mostly use for loop*
	}

}
