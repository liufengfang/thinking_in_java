package typeinfo.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by liufengfang on 2019/4/16.
 */
public class CglibDemo2 {
    public static void main(String[] args) {
        LogDelegate logDelegate = new LogDelegate();

        AService aService = logDelegate.createProxy(AService.class);
        aService.doSomething();

        System.out.println("------·Ö¸îÏß--------");

        aService = (AService) logDelegate.createProxy(new AService());
        aService.doSomething();
    }
}

class LogDelegate {
    Object proxied;

    public Object createProxy(Object proxied) {
        this.proxied = proxied;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(proxied.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                Object res = null;
                try {
                    System.out.println("before");
                    res = methodProxy.invoke(proxied, args);
                    System.out.println("after");
                } catch (Throwable throwable) {
                    System.out.println("exception");
                } finally {
                    System.out.println("before returning");
                }
                return res;
            }
        });

        return enhancer.create();
    }

    public <T> T createProxy(Class<T> tclass) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(tclass);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxyObject, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                Object res = null;
                try {
                    System.out.println("before");
                    res = methodProxy.invokeSuper(proxyObject, args);
                    System.out.println("after");
                } catch (Throwable throwable) {
                    System.out.println("exception");
                } finally {
                    System.out.println("before returning");
                }
                return res;
            }
        });

        return (T) enhancer.create();
    }

}
