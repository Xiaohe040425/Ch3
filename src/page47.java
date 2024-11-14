public class page47 {
    public static void main(String[] args) {
        System.out.println("宣告car1");
        P47Car car1 = new P47Car();
        car1.show();
        
        car1.setCar(1234, 20.5);
        car1.setName("1號車");
        car1.show();

    }
}

class P47Car {
    private int num;
    private double gas;
    private String name;

    public P47Car() {
        num = 0;
        gas = 0.0;
        name = "沒有名稱";
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }
    public void setName(String nm) {
    	name = nm;
    	System.out.println("將名稱設為" + name);
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("名稱是" + name);
    }
}
