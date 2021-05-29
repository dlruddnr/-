package sec06.exam01;
//원시타입 vs 참조타입
public class PrimitiveTypeExample {
	public static void main(String[] args) {
		//원시타입 총 8개, byte < 2short < 4int < 8long
		//4float < 8double
		//char
		//boolean
		//원시 타입은 리터럴 값을 저장
		byte var1=0;//max -128~127
		short var2=128;
		var1=(byte)var2;	//언더,오버플로우
		System.out.println(var1);
	}
}
