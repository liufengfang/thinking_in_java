package interfaces;

/**
 * Created by dulili on 2018/3/19.
 */
public class ExtendsIsAbstractClass extends IsAbstractClassHasProtectedMethods{
    //public 和 protected都不会报编译错误,运行也没有错误.private就会报编译错误
    @Override
    boolean defoutRight() {
        return false;
    }

    //重写编译器会检查返回参数类型和参数列表
    @Override
    public void protectedRight() {
        System.out.println("protectedRight");
    }

    public static void main(String[] args) {
        IsAbstractClassHasProtectedMethods ea = new ExtendsIsAbstractClass();
        System.out.println(ea.defoutRight());
        ea.protectedRight();
    }
}
