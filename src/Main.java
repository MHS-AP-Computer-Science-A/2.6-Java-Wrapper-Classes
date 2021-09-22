
public class Main {
	public static void main(String[] args) {
		
		//y is an int (primitive)
		//x is an Object version of an int
		Integer x = 7;
		int y = x * 2;
		
		//Because of autoboxing and unboxing, Java
		//converts between the two automatically
		
		//Another example
		int a = 7;
		Double b = 6.9;
		b = a + 3.0;
		b++;
		System.out.println(b/2);

		
		//The Integer.parseInt method is one example
		//of the tools provided by the Wrapper Classes
		String str = "1. Avocados";
		String num = str.substring(0, 1);   //“1”
		int value = Integer.parseInt(num);  // 1
		value++;
		System.out.println("value: " + value);

		
	}
}
