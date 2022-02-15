package EffectiveJava.Item53;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsageVarargs {
    public static void main(String[] args) {
        System.out.println(validate(
                                MaxMinType.FINDMIN,
                                new int[]{ 1,2,-3,4,5,6,7,81,9,10 })
        );
    }
    static int validate(MaxMinType maxMinType,int arr[]){
        switch (maxMinType){
            case FINDMAX:
               return max(arr);
            case FINDMIN:
                return min(arr);
            default:
                return 0;
        }
    }

    static int min(int arr[]){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    static int max(int arr[]){

        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}
