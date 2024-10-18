class Car implements Runnable{
    int a;
    public void run(){
        try {
            while(++a < 100){
                System.out.println("miles traveled : " + a);
                Thread.sleep(100);
            }
        } catch (Exception e) {
        }
    }
}

public class Run{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Car());
        t1.start();
    }
}