class Parent{
    int x, y;

    Parent(int x, int y){ // 1
        this.x = x;
        this.y = y;
    }

    int getT(){ // 2
        return x*y;
    }
}

class Child extends Parent{
    int x;

    Child(int x){ // 3
        super(x+1, x);
        this.x = x;
    }

    int getT(int n){ // 4
        return super.getT()+n;
    }
}

class Sequence{
    public static void main(String[] args) { // 5
        Parent parent = new Child(3); // 6
        System.out.println(parent.getT()); // 7
    }
}

// 실행 순서는 다음과 같다
// 5 6 3 1 7 2