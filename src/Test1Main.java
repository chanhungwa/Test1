
public class Test1Main {

	public static void main(String[] args) {
		System.out.println("This is test 1");
		System.out.println("Test function 'addNumb(10,20)' = "+addNum(10,20));
		for(int i = 0; i<10 ;i++)
			System.out.println("loop number: "+ (i+1));
		
		System.out.println("Hello World");
	}
	
	public static int addNum(int a, int b) {
		return a+b;
	}
	
	public static String print(String s) {
		return s;
	}

}
