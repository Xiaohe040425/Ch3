public class page26 {
    public static void main(String[] args) {
        P26Car car1 = new P26Car();

        car1.show();
    }
}

class P26Car {
    private int num;
    private double gas;

    public P26Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }

    public void show() {
        System.out.println("車號是 " + num);
        System.out.println("汽油量是 " + gas);
    }
}
