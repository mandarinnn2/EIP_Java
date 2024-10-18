public class Test{
    public static void main(String[] args){
        int r = 0;
        for(int i = 1; i < 999; i++){
            if(i % 3 == 0 && i % 2 == 0)
                r = i;
        }
        System.out.print(r);
    }
}