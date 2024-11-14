public class page31 {
    public static void main(String[] args) {
        P31Car.showSum();
    	
    	P31Car car1 = new P31Car();
        car1.setCar(1234, 20.5);
    	car1.show();
        
    	P31Car.showSum();
    	
        P31Car car2 = new P31Car();
        car2.setCar(4567, 30.5);
        car2.show();
        
        P31Car.showSum();
    }
}

class P31Car {
    public static int sum = 0;
	
	private int num;
    private double gas;

    public P31Car() {
        num = 0;
        gas = 0.0;
        sum++;
        System.out.println("生產了車子");
    }
    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }
    
    public static void showSum() {
    	System.out.println("總共有" + sum + "台車子");
    }
    
    public void show() {
        System.out.println("車號是 " + num);
        System.out.println("汽油量是 " + gas);
    }
}
