package override;

/**
 * Created by dulili on 2018/1/10.
 */
public class Parent {
    public int addValue(int a, int b) {
        int s;
        s = a + b;
        return s;
    }

    class Child extends Parent {
//        int addValue( int a, int b ){
//
//        }

        public void addValue(){
            System.out.println("hhh");
        }

        public int addValue( int a ){
            System.out.println("aaa");
            return 0;
        }

//        public int addValue( int a, int b )throws MyException {//do something��}  // �������쳣���쳣���ܳ������෽���쳣��Χ

//        public void addValue(int a,int b){//do something...} //�������쳣���������Ͳ�����void,��֮������void,������intҲ����

    }
}
