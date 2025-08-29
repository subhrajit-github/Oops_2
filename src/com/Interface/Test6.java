package com.Interface;
interface I7 {
    void m1();
}
interface I8 {
    void m2();
}
class E {
    public void m1() {
        System.out.println("m1()-A");
    }
    class F extends E implements I7, I8 {
        @Override
        public void m2() {
            System.out.println("m2()-B");
        }
    }
}
public class Test6 {
    public static void main(String[] args) {
        E e = new E();
        E.F f = e.new F();   // ✅ create inner class object

        I7 i = f;   // reference as I7
        i.m1();     // calls m1()-A

        // i.m2(); // ❌ not allowed (reference is I7)

        I8 i2 = f;  // reference as I8
        i2.m2();    // calls m2()-B

       
    }
}
