class Check{
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{1, 2, 3, 4};
        int[] c = new int[]{1, 2, 3};

        check(a, b);
        check(a, c);
        check(b, c);
    }
    public static void check(int[] a, int[] b){
        if(a==b)
            System.out.print("O");
        else
            System.out.print("N");
    }
}

// a와 b의 배열 내용은 같지만 서로 다른 주소값을 갖고 있기 때문에 모두 N이 출력된다.
// Arrays.equals(a, b)를 사용하여 비교하면 a와 b가 같기 때문에 True가 된다.