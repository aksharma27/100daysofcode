package com.company.Questions;

public class StrigSearch {
    public static void main(String[] args) {
        String sampleString = "Abhishek";
        int ans = searchString(sampleString, 'h');
        System.out.println("at index: "+ ans);
    }

    static int searchString(String string, char target){
        if (string.length() == 0){
            return -1;
        }
        for (int i = 0; i < string.length() ; i++) {
            char targetCharacter = string.charAt(i);
            if (targetCharacter == target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
