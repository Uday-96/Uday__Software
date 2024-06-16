// General Example
package methods;

public class FirstMethod {

 public void login() {                          // Non-Static Method in Same Class
	System.out.println("Uday");
}
 
 public static void Addition() {               // Static method in Same class 
	 System.out.println(10+5);
 }
 
 public void Subtraction() {
	System.out.println(897-89);
 }
 
public static void main(String[] args) {
	FirstMethod A = new FirstMethod();                  // To Declare NSM need to create the object 
	 A.login();                                        // New keyword Allow new memory to Object.
     Addition();                               //To call it use direct method name.
     A.Subtraction();
	}

}
