

public class page9 {
	public static void main(String[] args) {
		P9Car car1 = new P9Car();
		car1.num = 1234;
		car1.gas = 20.5;
		
		System.out.println("外部存取欄位");
		System.out.println("車號是" + car1.num);
		System.out.println("汽油量是" + car1.gas);
		System.out.println("內部存取欄位");
		car1.show();
		System.out.println("內部存取欄位+this.");
		car1.thisshow();
	} 
}


class P9Car{
	int num;
	double gas;
	
	void show(){
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
	void thisshow() {
		System.out.println("車號是" + this.num);
		System.out.println("汽油量是" + this.gas);
	}
}
