package classAndObject;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.orderNumber = 201907210001L;
		person.orderId = "abc123";
		person.orderDate ="2019년 7월 21일";
		person.orderName = "홍길동";
		person.orderProductId = "PD0345-12";
		person.orderAddress = "서울시 영등포구 여의도동 20번";
		
		System.out.println(person.orderNumber);
		System.out.println(person.orderId);
		System.out.println(person.orderDate);
		System.out.println(person.orderName);
		System.out.println(person.orderProductId);
		System.out.println(person.orderAddress);
		
		
	}
}
