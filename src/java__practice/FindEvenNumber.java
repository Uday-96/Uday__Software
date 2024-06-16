//WAP to print even Numbers from 50 to 100
package java__practice;

public class FindEvenNumber {

public static void main(String[] args) {
		 for(int i=50; i<=100; i++) {
			 if(i%2==0) {
				 System.out.println(i);
			 }
		 }
// Alternative Method
		 for(int i=100; i>=50; i--) {
			 if(i%2==0) {
				 System.out.println(i);
			 }
		 }
		 
	}

}
