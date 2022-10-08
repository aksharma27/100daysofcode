package com.company.Questions;

import java.util.ArrayList;

public class SearchEvens {

    static boolean even(int nums){
        int numberOfDigits = digits(nums);
//        if (numberOfDigits % 2 == 0){
//            return true;
//        }
//        return false;
        return numberOfDigits % 2 == 0;

    }
    static int digits(int num){
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums){
            if (even(num))
            {
                count++;
            }
        }
        return count;
    }
}