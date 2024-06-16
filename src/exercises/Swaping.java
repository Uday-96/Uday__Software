// WAP to swap Two Numbers with Using Third Variable and Scanner Class
package exercises;

import java.util.Scanner;                                                                    // Importing from java.util Package

public class Swaping {                                                                                                  // Class 

public static void main(String[] args) {                                                                          // Main Method

int a,b,c;                                                                   // Variable Initialization ,C is temporary variable
		
System.out.println("Enter two numbers");
		
Scanner S= new Scanner(System.in);                                                                  // Object of Scanner class
         
a=S.nextInt();                                                                      // Method of Scanner stored in 'a' Variable
	 
b=S.nextInt();                                                                     // Method of Scanner  stored in 'b' Variable
     
System.out.println("Before Swapping " +a+ " " +b);
    
c=a;                                                                                                                // c=a=100
a=b;                                                                                                   // 100=200 because b=200
b=c;                                                                                                                 // 200=100
System.out.println("After Swapping "+a+" " +b);
       
S.close();  // This method is used because if we don't use this method then [Resource leak will show in line no 13(Return Type is Void)]

}

}
