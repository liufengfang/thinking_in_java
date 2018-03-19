package interfaces;

import java.io.InterruptedIOException;

/**
 * Created by dulili on 2018/3/19.
 */
public class ImplementsTestInterface implements TestInterface
{
    //不能为protected。可以不抛出任何异常
    @Override
    public void f1(){

    }

    //可以抛出接口方法的子类异常,父类异常(如Exception)则不可以
    @Override
    public void f4() throws InterruptedIOException {

    }

}
