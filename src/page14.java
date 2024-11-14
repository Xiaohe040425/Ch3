public class page14 {
    public static void main(String[] args) {
        P14Car car1;                 
        car1 = new P14Car();          

        car1.setNum(1234);         
        car1.setGas(20.5);         
    }
}

class P14Car {
    int num;                       
    double gas;                    

    void setNum(int n) {           
        num = n;
        System.out.println("將車號設為 " + num);
    }

    void setGas(double g) {        
        gas = g;
        System.out.println("將汽油量設為 " + gas);
    }
}
