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

//        public int addValue( int a, int b )throws MyException {//do something…}  // 编译器异常，异常不能超出父类方法异常范围

//        public void addValue(int a,int b){//do something...} //编译器异常，返回类型不能是void,反之父类是void,子类是int也不行

    }
}
