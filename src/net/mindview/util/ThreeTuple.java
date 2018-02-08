//: net/mindview/util/ThreeTuple.java
package net.mindview.util;

public class ThreeTuple<J, B, C> extends TwoTuple<J, B> {
    public final C third;

    public ThreeTuple(J a, B b, C c) {
        super(a, b);
        third = c;
    }

    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
} ///:~
