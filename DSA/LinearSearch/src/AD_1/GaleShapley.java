package AD_1;

import java.util.Arrays;
import java.util.Scanner;

public class GaleShapley {
    static boolean checkPreference(int preference[][], int w, int m, int mCurrent){
        for (int i = 0; i < N; i++){
            if (preference[w][i] == mCurrent)
                return true;

            if (preference[w][i] == m)
                return false;
        }
            return false;
    }

    static void stableMarriage(int prefer[][]){
        int wPartner[] = new int[N];

        boolean[] mFree = new boolean[N];

        //initially all men and women are set free
        Arrays.fill(wPartner, -1);
        int freeCount = N;

        while (freeCount > 0){
            int  m;
            for (m = 0; m < N; m++)
            {
                if (mFree[m] == false)
                    break;
            }

            for (int i = 0; i < N && mFree[m] == false; i++) {
                int w = prefer[m][i];

                if (wPartner[w - N] == -1)
                {
                    wPartner[w - N] = m;
                    mFree[m] = true;
                    freeCount--;
                }
                else
                {
                    int m1 = wPartner[w - N];

                    if (checkPreference(prefer, w, m, m1) == false)
                    {
                        wPartner[w - N] = m;
                        mFree[m] = true;
                        mFree[m1] = false;
                    }
                }
            }
        }
        System.out.println("Woman Man");
        for (int i = 0; i < N; i++)
        {
            System.out.print(" ");
            System.out.println(i + N + "     " +
                    wPartner[i]);
        }
    }
    static Scanner in = new Scanner(System.in);
    static int N = in.nextInt();
    public static void main(String[] args)
    {
        System.out.println("N : "+N);
        int prefer[][] = new int[][]{{7, 5, 6, 4},
                {5, 4, 6, 7},
                {4, 5, 6, 7},
                {4, 5, 6, 7},
                {0, 1, 2, 3},
                {0, 1, 2, 3},
                {0, 1, 2, 3},
                {0, 1, 2, 3}};
        stableMarriage(prefer);
    }
}

