package SORTING.CyclicSort.Question;

import java.util.ArrayList;
import java.util.List;

//Google
public class FindAllMissings {
   List<Integer> findMissing(int[] arr){
       int i = 0;
       while (i < arr.length){
           int correct = arr[i];           //since starting from 0 so no -1
           if (arr[i] != arr[correct] ){
               swap(arr, i, correct);
           }
           else {
               i++;
           }
       }

       List<Integer> list = new ArrayList<>();
       for (int j = 0; j < arr.length; j++) {
           if (arr[j] != j+1){
               list.add(j + 1);
           }
       }
       return list;

   }

    static void swap(int[] arr, int first, int second){
        int temp = first;
        arr[first] = second;
        arr[second] = temp;
    }
}
