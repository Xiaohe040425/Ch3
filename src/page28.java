public class page28 {
    public static void main(String[] args) {
        P28Car car1 = new P28Car();
        car1.show();
        
        P28Car car2 = new P28Car(1234, 24.5);
        car2.show();
    }
}

class P28Car {
    private int num;
    private double gas;

    public P28Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
    public P28Car(int n, double g) {
        this();
    	num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }

    public void show() {
        System.out.println("車號是 " + num);
        System.out.println("汽油量是 " + gas);
    }
}
