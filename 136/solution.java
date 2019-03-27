    /**
     *Math
     sum = (a + a + b + b + c); 
     setsum = (a + b +c)
     single number = s*setsum - sum.
     *
     */


class Solution {
    public int singleNumber(int[] nums) {
        int sum = 0;
        int sumset = 0;
        for(int i : nums){
            sum += i;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }

        Iterator it = set.iterator();
        while(it.hasNext()){
            sumset += Integer.parseInt(it.next().toString());
        }

        return (2 * sumset - sum);
    }
}
/**
Using XOR
a ^ 0 = a; a ^ a = 0;

Example: [4 2 2]  ->[0100 0010 0010]
 step 1: 0100
         0010
        ------
         0110
 step 2: 0010
        ------
         0100

         Single number : 4           
*/

class Solution {
    public int singleNumber(int[] nums){
        int res = 0;
        for(int i : nums)
            res ^= i;
        return res;
    }
}
