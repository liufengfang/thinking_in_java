package interfaces;

import java.io.IOException;

/**
 * Created by dulili on 2018/3/19.
 */
public interface TestInterface {
    //Ĭ���ǣ�Ҳֻ����public static final
    int i = 0;

    //Ĭ����public������ֻ����public
    void f1() throws IOException;

    //������Ϊprotected
//    protected void f2();

    //������Ϊprivate
//    private void f3();

    void f4() throws IOException;
}
