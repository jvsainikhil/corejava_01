package java_basictoadvance_Enum;

enum compareStatus{ //prebuild
	Running, Failed, Pending, Success;
   //  0   |    1   |   2   |     3   |
  //ordinal---> order 
}

public class EnumIfSwitch {
	public static void main(String[] args) {
		
		compareStatus s=compareStatus.Running;
		
		//we are comparing 
		if (s==compareStatus.Running)
			System.out.println("All good");
		else if (s==compareStatus.Failed) 
			System.out.println("Try again");
		else if (s==compareStatus.Pending) 
			System.out.println("Please wait");
		else 
			System.out.println("Done");
	}
}
