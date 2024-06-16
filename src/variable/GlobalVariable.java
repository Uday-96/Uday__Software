// WAP to understand the Global Variable 
package variable;

public class GlobalVariable {
 
	int a=20;
	public void Calculation() {
		
	System.out.println("The Calculation of Global Variabe");
	}
	
public static void main(String[] args) {
	GlobalVariable A= new GlobalVariable ();
	 A.Calculation();
   System.out.println(A.a);
	}

}
