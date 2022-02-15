package ArrayAlgorithms;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(containsDublicate(new int[]{5, 6, 8, 34, 12, 32, 54, 76, 56, 45, 4}));
    }

    public static boolean containsDublicate(int numbs[]){
        HashSet<Integer> hashSet = new HashSet<>();
        /*
        for (int i = 0; i < numbs.length; i++) {
            if (hashSet.contains(numbs[i])){
                return true;
            }
            hashSet.add(numbs[i]);
        }
         */
        for (int i = 0; i < numbs.length; i++) {
            if (!hashSet.add(numbs[i])){
                return true;
            }
        }
        return false;
    }
}

