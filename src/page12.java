

public class page12 {
	public static void main(String[] args) {
		P12Car car1 = new P12Car();
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.showCar();
	} 
}


class P12Car{
	int num;
	double gas;
	
	void show(){
		System.out.println("車號是" + this.num);
		System.out.println("汽油量是" + this.gas);
	}
	void showCar() {
		System.out.println("開始顯示車子資料");
		show();
	}
}
