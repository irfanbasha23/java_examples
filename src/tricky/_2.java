package tricky;

public class _2 {
    int a,b;
    public _2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        // _2 b = new _2(); If there is at least one constructor then we should stick to that one only
        _2 b = new _2(1,2);
        System.out.println(b.a);
    }
}
