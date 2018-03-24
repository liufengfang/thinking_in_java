package arrays;//: arrays/AlphabeticSearch.java
// Searching with a Comparator.
import java.util.*;
import net.mindview.util.*;

public class ComparatorAndBinarySearch {
  public static void main(String[] args) {
    String[] sa = new String[]{"bkIna","AqUCB","SSS","ogoYW"};
    System.out.println(Arrays.toString(sa));
//    Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
//    System.out.println(Arrays.toString(sa));
    int index = Arrays.binarySearch(sa, sa[0],String.CASE_INSENSITIVE_ORDER);
    System.out.println("Index: "+ index + "\n"+ sa[index]);
  }
} /**out
 [bkIna, AqUCB, SSS, ogoYW]
 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -3
 at arrays.ComparatorAndBinarySearch.main(ComparatorAndBinarySearch.java:13)
 */
