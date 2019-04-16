package typeinfo.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by liufengfang on 2019/4/11.
 */
public class CglibDemo {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        //��ʵ��jdkһ�����ȿ�����Ƴɴ����ã�Ҳ������Ƴɴ�Class��
        enhancer.setSuperclass(AService.class);
        enhancer.setCallback(new AServiceImpl());

        AService aService = (AService) enhancer.create();
        aService.doSomething();
    }
}

class AService {
    public String doSomething() {
        System.out.println("do something!");
        return "do something";
    }
}

class AServiceImpl implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object resObj = methodProxy.invokeSuper(o, args);
        System.out.println("after");
        return resObj;
    }
}