package leetcode;

class Base {
    public void foo() { System.out.println("Base"); }
}

class Derived extends Base {
    //private void foo() { System.out.println("Derived"); }
    public void foo() { System.out.println("Derived"); }
}

public class Main {
    public static void main(String args[])
    {
        Derived d = new Derived();
        d.foo();
    }}