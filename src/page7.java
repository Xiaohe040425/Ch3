

public class page7 {
	public static void main(String[] args) {
		P7Car car1 = new P7Car();
		car1.num = 1234;
		car1.gas = 20.5;
		
		P7Car car2 = new P7Car();
		car2.num = 2345;
		car2.gas = 30.5;
		
		System.out.println("車號是" + car1.num);
		System.out.println("汽油量是" + car1.gas);
		System.out.println("車號是" + car2.num);
		System.out.println("汽油量是" + car2.gas);
	} 
}


class P7Car{
	int num;
	double gas;
}
