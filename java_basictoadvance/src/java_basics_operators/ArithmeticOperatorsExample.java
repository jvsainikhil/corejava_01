package java_basics_operators;

public class ArithmeticOperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        float b = 3;

        // Division
        float resultDiv = a / b; // Integer division
        double resultDivFloat = (double) a / b; // Floating-point division

        // Modulus
        float resultMod = a % b;

        System.out.println("Integer Division (10 / 3) = " + resultDiv);
        System.out.println("Floating Point Division (10.0 / 3) = " + resultDivFloat);
        System.out.println("Modulus (10 % 3) = " + resultMod);
        System.out.printf("this is the out put %d",a);
    
        //pre and post increaments
    int num =7, pre =10;
    //num1 += 1;
    ++num; //post increament
    System.out.println(num);
    num++; //pre increament adding by 1
    num--; //decreament decreasing by1
    if (num==7){
    	System.out.println("\n num1:"+num);
    }
    else {
    	System.out.println("the number is not same as before by logic");
    }
    
    // Difference between ++num & num++
     int preresult = pre++; //assigned value will print
     int preresult1= ++pre; //1st it will increment by value
     System.out.println("value of pre: "+preresult);
     System.out.println("value of pre1: "+preresult1);
        
    
    }
}//

   // - %d which is used to insert any value in middle in according to an given order it will be assigned, 
                                                                                                         