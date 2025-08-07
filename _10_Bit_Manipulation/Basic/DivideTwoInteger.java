package _10_Bit_Manipulation.Basic;
public class DivideTwoInteger {
    
    public static int divide(int dividend, int divisor) {
         if(dividend ==  divisor){
            return 1;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        }
        
        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        long ans = 0;
        while(n >= d){
            int count = 0;
            while(n >= (d << (count + 1))){
                count += 1;
            }
            ans += 1 << count;
            n -= d << count;
        }
        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0))
            return (int)-ans;
        return (int)ans;
    }
    public static void main(String[] args) {
        System.out.println(divide(2147483647,-1));
        System.out.println(divide(-2147483648,-1));
        System.out.println(divide(10,3));
    }
}