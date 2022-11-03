package OA_Cuvette;

import java.util.ArrayList;
import java.util.List;

public class Q2
{
   static float average(int[] arr){
       float max = arr[0];
       float min = arr[0];
       for (int i = 0; i < arr.length; i++){
           if (arr[i] > max){
               max = arr[i];
           }
           if (arr[i] < min){
               min = arr[i];
           }
       }

       float avg = (max + min) / 2;
       return avg;
   }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2};
        float ans = average(arr);
        System.out.println(ans);
    }
}
