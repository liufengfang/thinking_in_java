package arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by dulili on 2018/3/24.
 */
public class ComparatorForInt {
    public static void main(String[] args) {
//        int[] ints = {1, 2, new Integer(9)}; //!基本类型数组不行
        Integer[] ints = {1, 2, new Integer(9)};
        Arrays.sort(ints, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1>i2?-1:(i1<i2?1:0);
            }
        });
        System.out.println(Arrays.toString(ints));
    }
}
