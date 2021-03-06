package di3;
/**
 * 
 * 
 *
 */

// di3 : setter로 tire 설정

public class Test {
	
	public static void main(String[] args) {
		Tire t = new KoreaTire();
		Car c = new Car();
		c.setTire(t);
		c.drive();
		
	} // end of main
} // end of class

// 소스코드의 의존성이 들어가는 코드를 모두 제거하고,
// 의존성이 꼭 들어가야하는 코드는 한 곳에 몰아놓음(스프링컨테이너)
// 그러한 역할을 스프링 컨테이너가 함 그것을 IoC(제어역전)이라고 함.

// 우리는 내맘대로 작업을 했지만 그렇게 짜면 뭐하나 수정하면 다 바꿔야함
// 그래서 그러한 구조를 바꾸고 좀더 효율적으로 구현할 수 있도록 하는 것이 스프링

// 1.생성자, 2.setter  2가지 방법이 있다.
