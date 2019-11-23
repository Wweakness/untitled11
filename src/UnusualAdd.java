//将两个数相加，不得+等其他运算符

import java.util.*;

public class UnusualAdd {
    public static int addAB(int A, int B) {
        // write code here
        int m=A^B;
        int n=(A&B)<<1;
        int sum=m+n;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=addAB(a,b);
        System.out.println(s);

    }
}
