class Connection{
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