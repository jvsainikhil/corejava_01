package java_basics_loops;

public class NeedOfLoops {

	public static void main(String[] args) {
		// to print multiple time
		// loop - while, do while, for
		//1.normally
		//int a=9;
		//System.out.println("hi\n".repeat(a));

		//		int i=1;
		//		while(i<=4) {
		//			System.out.println("Hi"+i);
		//			i++;
		//		}
		//		System.out.println("bye"+i);
		// while loop
		int i=1;
		while(i<=4) {
			System.out.println("Hi: "+i);
			int j=1;
			while(j<=3) {
				System.out.println("Hello: "+j);
				j++;
			}
			i++;
		}
		System.out.println("Bye: "+i);
		//------------------------------------------
		//do while loop: if the message should send once
		//the user is busy that kind of message
		int w=3;
		
		do
		{
			System.out.println("this is W :hi "+w);
			w++;
		}while(w<=4);
	}
}










