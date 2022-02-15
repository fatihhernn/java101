package ArrayAlgorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class InArrayFindTarget{
    public static void main(String[] args) {
        int[] intArray = twoSum(new int[]{2,7,11,5} ,9);
        System.out.println(Arrays.toString(intArray));
    }

    public static int[] twoSum(int[] numbs, int target){
        HashMap<Integer,Integer> hm=new HashMap<>();

        for (int i = 0; i < numbs.length; i++) {
            int temp=target-numbs[i];
            if (hm.keySet().contains(temp)){
                return new int[]{hm.get(temp),i};
            }
            hm.put(numbs[i],i);
        }
        return new int[0];
    }
}
