package ArrayAlgorithms;

import java.util.Arrays;

public class FindMaxProfit {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{8, 7, 11, 5}));
    }

    public static int maxProfit(int[] prices){

        if (prices.length==0){
            return 0;
        }

        int minSoFar =prices[0];
        int maxProfit=0;

        for (int i = 0; i < prices.length; i++) {
            if (minSoFar>prices[i]){
                minSoFar=prices[i];
            }
            if (prices[i]-minSoFar>maxProfit){
                maxProfit=prices[i]-minSoFar;
            }
        }
        return maxProfit;
    }
}
