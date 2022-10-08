package com.company.Questions;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] account = {
                {1,3,6},
                {4,8,1},
                {9,4,7}
        };

        int ans = maxWealth(account);
        System.out.println(ans);
    }

    public static int maxWealth(int[][] accounts){
        //person = col
        //account = row
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++)
        {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account];
            }
            //now we have sum of accounts of person
            //check with overall answer
            if (sum > ans)
                ans = sum;
        }
        return ans;
    }
}
