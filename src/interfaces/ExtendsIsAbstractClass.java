package interfaces;

/**
 * Created by dulili on 2018/3/19.
 */
public class ExtendsIsAbstractClass extends IsAbstractClassHasProtectedMethods{
    //public �� protected�����ᱨ�������,����Ҳû�д���.private�ͻᱨ�������
    @Override
    boolean defoutRight() {
        return false;
    }

    //��д���������鷵�ز������ͺͲ����б�
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
