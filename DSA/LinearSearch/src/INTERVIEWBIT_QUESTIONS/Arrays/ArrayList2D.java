package INTERVIEWBIT_QUESTIONS.Arrays;

import java.util.ArrayList;

public class ArrayList2D {
    static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < 12; j++) {
                A.get(i).add(i);
            }
        }
        performOps(A);

        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < A.get(i).size(); j++) {
                System.out.println(A.get(i).get(j) + " ");
            }
        }
    }
}
