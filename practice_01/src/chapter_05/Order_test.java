package chapter_05;

import chapter_05.Order;

public class Order_test {
	
	public static void main(String[] args) {
		
		Order order = new Order();
		order.number = 201803120001L;
		order.ID = "abc123";
		order.date = "2018년 3월 12일";
		order.name = "홍길순";
		order.product = "PD0345-12";	// product = 주문 상품 번호
		order.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : "+order.number);
		System.out.println("주문자 아이디 : "+order.ID);
		System.out.println("주문 날짜 : "+order.date);
		System.out.println("주문자 이름 : "+order.name);
		System.out.println("주문 상품 번호 : "+order.product);
		System.out.println("배송 주소 : "+order.address);
		
	}
}
