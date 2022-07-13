package SeleniumDemo;

public class Atmecs {

	public static void main(String[] args) {
		String a = " Hello How Are You";
		System.out.println(a);
        char[] arr = a.toCharArray();
		for( int i=arr.length-1; i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}
