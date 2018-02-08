package holding;//: holding/ListFeatures.java

import typeinfo.pets.*;

import java.util.*;

import static net.mindview.util.Print.*;

public class ListFeatures {
    public static void main(String[] args) {
        List<Pet> sub;

        List<Pet> pets = Pets.arrayList(7);
        print("pets : " + pets);

//        pets.add(3, new Mouse()); // Insert at an index
//        print("9: " + pets);

//        sub = pets.subList(1, 4);
        // todo  异常:ConcurrentModificationException 但在List<Pet> sub = pets.subList(1, 4);之前就可以了
//        pets.add(1,new Pug());
//        sub.add(1,new Pug());
//        print("subList: " + sub);
//        print("10: " + pets.containsAll(sub));

//        List<Pet> copy = new ArrayList<Pet>(pets);
//        sub = Arrays.asList(pets.get(1), pets.get(4));
//        print("sub: " + sub);
////        copy.retainAll(sub);
////        print("13: " + copy);
//
//        copy = new ArrayList<Pet>(pets); // Get a fresh copy
//        copy.addAll(2, sub); // Insert a list in the middle

        Pet[] pa = pets.toArray(new Pet[0]);
        print("23: " + pa[3].id());
    }
}
