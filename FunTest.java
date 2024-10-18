class FunTest{
    public static void main(String[] args){
        cond obj = new cond(3);
        obj.a = 5;
        int b = obj.func();
        System.out.print(obj.a + b);
    }
}

class cond{
    int a;
    public cond(int a){
        this.a = a;
    }

    public int func(){
        int b = 1;
        for(int i = 0; i< a; i++)
            b += a * i;
        return a + b;
    }
}