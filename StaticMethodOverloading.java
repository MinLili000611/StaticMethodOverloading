package staticMethodOverload;
//This java program explains static method overloading.
public class StaticMethodOverloading {
	
  public static void staticMethod(){
	  System.out.println("staticMethod(): Zero arguments");	  
  }
  
  public static void staticMethod(int a) {
	  System.out.println("staticMethod(int a): one argument");	  
  }
  
  public static void staticMethod(String str, int x) {
	  System.out.println("staticMethod(String str, int x):two arguments");
  }
  
  public static void main(String[]args) {
	  StaticMethodOverloading.staticMethod();
	  StaticMethodOverloading.staticMethod(12);
	  StaticMethodOverloading.staticMethod("Static method overloading",10);
  }
}
