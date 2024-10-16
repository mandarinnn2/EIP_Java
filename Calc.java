
class P {

    public int calc(int n) {
        if (n <= 1) {
            return n;
        }
        return calc(n - 1) + calc(n - 2);
    }
}

class C extends P {
    @Override
    public int calc(int n){
        if(n <= 1){
            return n;
        }
        return calc(n-3) + calc(n-1);
    }
}

public class Calc {

    public static void main(String[] args) {
        P ob = new C();
        System.out.print(ob.calc(7));
    
 
   }
}