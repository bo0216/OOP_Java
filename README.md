# OOP_Java

## 객체지향 프로그래밍

1. 인스턴스, 힙 메모리
2. 정보 은닉
3. this에 대하여 <br>
	- 자신의 메모리를 가리킴<br>
	- 생성자에서 다른 생성자를 호출 함<br>
```java
	public Person(){
		this("이름없음",1);
	}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
```
	<br>
	- 인스턴스 자신의 주소를 반환 