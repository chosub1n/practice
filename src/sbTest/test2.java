package sbTest;

public class test2 {
	public static void main(String[] args) {
		if(true) { //false로 할 경우 아무런 값도 출력되지 않음.
			System.out.println("result : true");
		}
		
		if(true) { //false로 할 경우 조건문을 밖에 있는 5만 출력
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}
		System.out.println(5);
	}

}
