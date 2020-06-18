public class Solution {

    /*public static int solution(int[] number) {
        int sum = 0;
        for (int x : number) {
            if (x % 3 == 0 || x % 5 == 0)
                sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = solution(b);
        System.out.println(sum);
    } */

        public static int solution(int number) {
            int sum = 0;
            if (number % 3 == 0 || number % 5 == 0)  {
                sum += number;
            }
            return sum;
        }
        public static void main(String[] args) {
            int b;
            int sum = 0;
            for(int i = 0; i < 10; i++) {
                b = i;
                sum += solution(b);
            }
            System.out.println(sum);
        }
    }

