package chapter04;

public class LoopWhileEx01 {

		public static void main(String[] args) {
			
			int num=1;
			int sum=0;
			
			while (num<=10) {
				sum += num;
				num++;
			}
			System.out.println("1���� 10������ ���� " +sum+"�Դϴ�.");
			System.out.println("sum : "+sum);
			System.out.println("num : "+num);
		}
}
