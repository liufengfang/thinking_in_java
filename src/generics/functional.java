package generics;

import typeinfo.pets.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by liufengfang on 2018/6/1.
 */
public class functional {

    public static void main(String[] args) {
//        List<Dog> dogList = new ArrayList<>();
        List<String> strList = new ArrayList<>();
        strList.add("text");
        strList.add("text");
        f(strList);
        //        f3(strList);
        //?
//        f2(new ArrayList<>(strList));
        List someList = new ArrayList<List<String>>();
        someList.add(strList);
        f2(someList);

    }

    static void f(List<? extends CharSequence> charSequenceList){
//        charSequenceList.add("a");
        charSequenceList.get(0);

    }

    static void f3(List<? super CharSequence> list) {

    }

    static void f2(List<? super List<String>> someList) {
        someList.add(new ArrayList<String>());

        System.out.println(someList);
    }

}

interface First<T> {

}


