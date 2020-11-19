/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longnv.util;

/**
 *
 * @author Asus
 */
public class MathUtility {
    // class chua ham tien ich dung cung cho moi noi
    // do do no phai ne la static
    public static final double PI = 3.14;
    
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20){
//            throw new IllegalArgumentException("n must be > 0 & < 20");
//        }
//        if (n == 0 || n == 1){
//            return 1;
//        }
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
    
        public static long getFactorial(int n){
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("n must be > 0 & < 20");
        }
        if (n == 0 || n == 1){
            return 1;
        }
        return n * getFactorial(n - 1);
    }
    
    
   
}
