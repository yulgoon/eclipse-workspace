package array;

public class TwoDimensionEx {
	public static void main(String[] args) {
		char[][] arr = {{'a','b'},{'c','d'},{'e','f'},{'g','h'},{'i','j'},{'k','l'},{'m','n'},{'o','p'},{'q','r'},{'s','t'},{'u','v'},{'w','x'},{'y','z'}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
