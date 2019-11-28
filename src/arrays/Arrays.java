package arrays;

public class Arrays {
	static int [] numberArray = {4, 50, 650, 66, 6549, 51, 51, 554, 444, 10};
	static int [] intArray = new int [10];
	
	static public void createArray() {
		System.out.println("Integer Array");
		for(int i = 0; i < intArray.length; i++) {
			int randomValue = (int) (Math.random()*10);
			intArray[i] = randomValue;
			System.out.println(intArray[i]);
		}
		System.out.println("Array * 10");
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] *= 10;
			System.out.println(intArray[i]);
		}
		
	}
	
	public static void main(String[] args) {
		for(int i : numberArray) {
			System.out.println(i);
		}
		createArray();
		
	}
}
