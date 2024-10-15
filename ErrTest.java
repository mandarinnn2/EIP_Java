class Person{
    private String name;
    public Person(String val){
        name = val;
    }
    public static String get(){
        return name;
    }
    public void print(){
        System.out.println(name);
    }
}

public class ErrTest{
    public static void main(String[] args){
        Person obj = new Person("Kim");
        obj.print();
    }
}

// 정적 메서드는 클래스에 속하며 객체 없이 호출 가능하고
// 인스턴스 변수는 객체가 존재해야만 사용할 수 있다.