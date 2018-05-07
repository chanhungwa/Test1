
public class Test1Main {

	public static void main(String[] args) {
		System.out.println("This is test 1");
		System.out.println("Test function 'addNumb(10,20)' = "+addNum(10,20));
		for(int i = 0; i<10 ;i++)
			System.out.println("loop number: "+ (i+1));
		
<<<<<<< HEAD
		System.out.println(print("Hello World!!!!!!!"));
=======
		System.out.println(print("Hello World"));
		System.out.println("new line added");
>>>>>>> 218818f98f46371e07ee08ab30e7e1c66d947384
	}
	
	public static int addNum(int a, int b) {
		return a+b;
	}
	
	public static String print(String s) {
		return s;
	}

}
