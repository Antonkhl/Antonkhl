public class Labb2 {

	public static void main(String[] args) {
		
		
	
		
	}
	
	
	
	public static int compareNumbers(int a, int b) {
		int result = 0;
		
		if(a < b) { //En while method passar inte i i denna sammanhang, en bättra alternativ är att använda if och else.
			result = b;
		} 
		
		else {
		result = a;
		}
		
		return result;
	}
	
	
	
	public static void xListSizeComparison(int[] arr, int x) { //Ändrar till void så att man kan använda 
		for (int i = 0; i <= arr.length; i++) {
			
			if(arr[i] == x) {
				System.out.println("True"); 
			}
			
			else {
				System.out.println("True");
			}
			
		}
		
		
	}
	
	
	
	public static String wordLength(String str) {
		String result = "";
		
		for (int i = str.length(); i > 0; i++) {
			result += str.charAt(i); // Vi vill veta resultaten inte att vi ska lägga till nummer till en string.
		}
		
		return result;
	}
	
	
	
	public static void m4(int hours, int minutes, int removedMinutes) {
		minutes -= removedMinutes;
		
		if(minutes < 0) {
			hours--;
			minutes += 60;
		}
		
		System.out.println(hours + " " + minutes);
	}
	
	
	
	public static void m5(int num1, int num2, int count) {
		for (int i = 1; i <= count; i++) {
			
			if(i % num1 == 0) {
				System.out.println("Fizz");
			} 
			else if (i % num2 == 0) {
				System.out.println("Buzz");
			} 
			else {
				System.out.println(i);
			}
		}
	}
	
}
