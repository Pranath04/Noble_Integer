package nobelintegers;

import java.util.Arrays;
import java.util.Scanner;

public class Nobelinteger{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		System.out.println("Enter the array elements");
		int []arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println(nobel(arr,size));
	}
	public static int nobel(int []arr,int size) {
		Arrays.sort(arr);
		for(int i=0;i<size;i++) {
		if(arr[i]==size-i-1) {
			return 1;
		}
		}
		return -1;
	}
}