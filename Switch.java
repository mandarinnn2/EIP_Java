public class Switch{
    public static void main(String[] args){
        int i = 3, k = 1;
        switch(i){
            case 1: k++;
            case 2: k -= 3;
            case 3: k = 0;
            case 4: k += 3;
            case 5: k -= 10;
            default: k--;
        }
        System.out.print(k);
    }
}