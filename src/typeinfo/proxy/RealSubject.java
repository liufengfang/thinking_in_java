package typeinfo.proxy;

/**
 * Created by liufengfang on 2019/4/4.
 */
public class RealSubject implements Subject{
    @Override
    public void request(String str) {
        System.out.println("RealSubject do something : " + str);
    }

    public void notInteresting(){
        System.out.println("RealSubject notInteresting");
    }
}
