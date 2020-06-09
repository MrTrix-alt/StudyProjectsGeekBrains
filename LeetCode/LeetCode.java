package ru.homework.lessonOne;

public class LeetCode {
    public static int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

    public static double myPow(double x, int n) {
        return Math.pow(x, n);
    }

    static void superPow(int a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            int pow = (int) Math.pow(a, b[i]);
            System.out.print(pow + " ");
        }
    }

    public static int getSum(int a, int b) {
        while(b!=0) {
            int c = a&b;
            a=a^b;
            b=c<<1;
        }

        return a;
    }


        public static boolean isPerfectSquare(int num) {
        boolean is = true;
            for(int sum = 0,  i = 1; sum < num; i +=2) {
                sum += i;
                if (sum == num) {
                    return is;
                }
            }
            return !is;
        }

        public static int removeDuplicates(int[] nums) {
            int len = removeDuplicates(nums);
            for (int i = 0; i < len; i++) {
                System.out.println(nums[i]);
            }
            return len;
        }





    public static void main(String[] args) {

        int d = mySqrt(15);
        System.out.println(d);

        // double z = c.myPow(4f, -3);
        System.out.println(myPow(3, -100));

        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        superPow(2, b);
        System.out.println();

        System.out.println(getSum(1,2));

        System.out.println(isPerfectSquare(16));

        int[] arr = {1, 1, 2};
            removeDuplicates(arr);
    }
}


