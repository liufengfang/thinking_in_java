package interfaces;

import java.io.InterruptedIOException;

/**
 * Created by dulili on 2018/3/19.
 */
public class ImplementsTestInterface implements TestInterface
{
    //����Ϊprotected�����Բ��׳��κ��쳣
    @Override
    public void f1(){

    }

    //�����׳��ӿڷ����������쳣,�����쳣(��Exception)�򲻿���
    @Override
    public void f4() throws InterruptedIOException {

    }

}
