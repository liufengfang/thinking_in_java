package typeinfo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by liufengfang on 2019/4/4.
 */
public class IntrestingDynamicProxyHandler implements InvocationHandler {
    Object proxied;

    public IntrestingDynamicProxyHandler(Object object) {
        this.proxied = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("procceding:Class="+proxy.getClass().getName()+",method="+method.getName());
        if (null != args) {
            for (int i = 0; i < args.length; i++) {
                args[i] += "shiiiiiit";
            }
        }
        return method.invoke(proxied,args);
    }
}

class dpHandler2 implements InvocationHandler{
    Object proxied;

    public dpHandler2(Object object) {
        this.proxied = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("procceding:Class="+proxy.getClass().getName()+",method="+method.getName());
        if ("request".equals(method.getName())) {
            System.out.println("request is my interesting!");
            return method.invoke(proxied,args);
        }
        return null;
    }
}

class Test{
    static void consume(Subject subject) {
        subject.notInteresting();
        subject.request("request221");
    }
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealSubject rs = new RealSubject();
        //proxyHandler1
        Subject proxy = (Subject) Proxy.newProxyInstance(
                rs.getClass().getClassLoader(),
                new Class[]{Subject.class},
                new IntrestingDynamicProxyHandler(rs));
        consume(proxy);

        //proxyHandler2
        proxy = (Subject) Proxy.newProxyInstance(
                rs.getClass().getClassLoader(),
                new Class[]{Subject.class},
                new dpHandler2(rs));
        consume(proxy);


        RealObject ro = new RealObject();
        //proxy another Class
        Interface iface = (Interface)Proxy.newProxyInstance(
                ro.getClass().getClassLoader(),
                new Class[]{Interface.class},
                new IntrestingDynamicProxyHandler(ro)
        );
        consumer(iface);
    }
}

