package thisEx;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		this("이름없음", 1); //first statement여야 한다. 
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public void showInfo() {
		System.out.println(name + "," + age);
	}
	
	public Person getSelf() { //자기 클래스 자기 자신  
		return this; //this로 반환.
	}
}
