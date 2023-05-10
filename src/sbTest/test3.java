package sbTest;

public class test3 { //반복문 테스트
	public static void main(String[] args) {
		int i = 0; //i는 0부터 
		while(i<=10) { // 10까지 반복
			System.out.println("coding" + i);
			i++; // i가 1씩 증가
			//break; 반복문 빠져나갈 때 씀
		}
		System.out.println("---------------------");
		
		for(int i1 = 0; i1 < 10; i1++) {
			System.out.println("coding" + i1);			
		}
	}

}
