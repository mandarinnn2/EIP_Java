class Connection{
    /*
    클래스 Connection의 단일 인스턴스를 저장
    Singleton 패턴에서는 클래스의 인스턴스가 오직 하나만 생성되어야 한다.
    이때 _inst는 클래스가 메모리에 올라갈 때 하남나 생성되도록 보장해준다.
    정적 변수로 선언되었기 때문에 프로그램의 어디서든지 동일한 인스턴스를 참조할 수 있다.
    */

    /*
    인스턴스는 객체 지향 프로그래밍에서 클래스를 기반으로 생성된 실체 객체를 의미한다.
    클래스를 설계도라고 생각할 수 있다면, 인스턴스는 그 설계도를 바탕으로 실제로 만들어진 물건이라 할 수 있다.
    */

    /*
    클래스
    객체를 정의하는 청사진(설계도)
    클래스는 속성(변수)과 메서드(함수)로 구성되며, 객체가 어떤 특성을 가질지, 어떤 행동을 할지 정의한다.
    예를 들어 Car라는 클래스를 정의하면, 이 클래스는 자동차가 가질 속성(색깔, 속도 등)과 어떤 행동을 정의한다.

    인스턴스
    클래스에 정의된 설계도로부터 실제 메모리에 만들어진 구체적인 객체
    예를 들어 Car클래스에서 myCar 라는 인스턴스를 생성하면, myCar는 특정한 속성을 가진 하나의 실제 자동차 객체가 된다.
    */


    private static Connection _inst = null;
    private int count = 0;

    static public Connection get(){
        if(_inst == null){
            _inst = new Connection();
            return _inst;
        }
        return _inst;
    }

    public void count(){
        count++;
    }

    public int getCount(){
        return count;
    }
}

public class main{
    public static void main(String[] args) {
        Connection conn1 = Connection.get();
        conn1.count();

        Connection conn2 = Connection.get();
        conn2.count();

        Connection conn3 = Connection.get();
        conn3.count();

        conn1.count();
        System.out.print(conn1.getCount());
    }
}

/* 
Singleton 패턴을 사용하여 Connection 클래스의 인스턴스를 하나만 생성하도록 구현
Singleton 패턴을 사용하면 클래스의 인스턴스가 프로그램 전체에서 하나로 고정되고, 모든 객체가 동일한 인스턴스에 접근하게 된다.
*/