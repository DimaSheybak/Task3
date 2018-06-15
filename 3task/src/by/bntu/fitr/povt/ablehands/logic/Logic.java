
package by.bntu.fitr.povt.ablehands.logic;

    
import java.util.List;

public class Logic {
     public static void concatenations(List<Integer> list1, List<Integer> list2) {
        int j = list1.size() - 1;
        int i = list2.size() - 1;
        list1.addAll(list2);
        int k = list1.size() - 1; 
        while (j >= 0 && i >= 0) {

            if (list1.get(j) > list2.get(i)) {
                list1.set(k, list1.get(j));
                j--;
            } else {
                list1.set(k, list2.get(i));
                i--;
            }
            k--;
        }

    }
    
}
