package interfaces;

import java.io.IOException;

/**
 * Created by dulili on 2018/3/19.
 */
public interface TestInterface {
    //默认是，也只能是public static final
    int i = 0;

    //默认是public，而且只能是public
    void f1() throws IOException;

    //不允许为protected
//    protected void f2();

    //不允许为private
//    private void f3();

    void f4() throws IOException;
}
