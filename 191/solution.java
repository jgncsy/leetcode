    /**
     * 进制转换
     *
     */


public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        
        String str = Integer.toBinaryString(n);
        
        for(char ch : str.toCharArray()){
            if(ch == '1') count++;
        }
        return count;
    }
}

/**
 *loop and flip
 Check each 32 bits of the number, for binary integer, the maximum bits is 32. Initial mask equal to 1, and with number.
  If the bit is one, count add 1. Then shift mask to left by one. 
 Example:
       001101
  mask:000001
  -------------
       000001 (If not equal to 0, count add one.)

       001101
  mask:000010
  -------------
       000001 (Equal to one, because this bit is 0.)

       001101
  mask:000100
  -------------
       000100 (Add one)     

       001101
  mask:001000
  -------------
       001000 (Add one)     
       .
       .
       .
  count = 3;     

*/

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       int bit = 0;
       int mask = 1;
        
        for(int i = 0; i < 32; i++){
            if((n & mask) != 0){
                bit++;
            }
            mask <<= 1;
        }
        return bit;
    }
}

/**
*Bit Manipulation Trick
Until number equal to 0, using n & (n-1) to change the last 1 bit to 0; Count times.

Example:
    n : 001011
    n-1:001010
    ------------
    n   001010 (Change the last 1 bit to 0) 
    n-1 001001
    -----------
    n   001000
    n-1 000111
    -----------
        000000 (count times)   
*
*/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       int sum = 0;
       while (n != 0){
           n = n & (n - 1);
           sum++;
       }
        return sum;
    }
}