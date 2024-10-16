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

// static 변수와 메서드는 특정 클래스내에서만 생성할 수 있다
// 오류를 수정하려면 변수를 static으로 변경해야한다.
// static 변수는 객체가 필요 없어서 클래스이름.메서드()로 호출하여 사용하면 된다.