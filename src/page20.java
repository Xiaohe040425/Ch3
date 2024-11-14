public class page20 {
	public static void main(String[] args) {
		P20Car car1 = new P20Car();
		car1.num = 1234;
		car1.gas = -10;
		
		car1.show();
	} 
}


class P20Car{
	int num;
	double gas;
	
	void show(){
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}

