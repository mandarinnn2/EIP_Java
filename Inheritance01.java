class SuperObject{
    public void draw(){
        System.out.println("A");
        draw();
    }

    public void paint(){
        System.out.println("B");
        draw();
    }
}

class SubObject extends SuperObject{
    public void paint(){
        super.paint();
        System.out.println("C");
        draw();
    }

    public void draw(){
        System.out.print("D");
    }

}
class Inheritance{
    public static void main(String[] args){
        SuperObject a = new SubObject();
        a.paint();
        a.draw();
    }
}