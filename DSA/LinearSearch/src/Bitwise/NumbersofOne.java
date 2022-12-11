package Bitwise;

public class NumbersofOne {
    public static void main(String[] args) {
        int i1 = 9;
        int x = bitReturn(i1);
        System.out.println(x);
    }
    static int bitReturn(int i){
        int count = 0;
        while(i > 0){
            count += i & 1;
            i >>= 1;
        }
        return count;
    }


}
