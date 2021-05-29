package sec06.exam01;

public class printExample {
	public static void main(String[] arg) {
		System.out.println("하하");
		System.out.println("호호");
		System.out.print("하하");
		System.out.print("호호");
		System.out.println();
//----------------------------------------------------
		char bloodtype='o';
		int age=10;
		float weight=30.4f;
		String name ="홍길동";
		System.out.printf("이름은 %s이고 나이는 %05d입니다 혈액형은 %-8c입니다 몸부게는 %05.1f입니다",name,age,bloodtype,weight);
		
	}
}
