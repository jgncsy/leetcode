    /**
     * using math:
     * sumset = (a + b + c )
     * sum = (a + a + b + b + c)
     *
     * singlenumber = 2 * sumset - sum
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
using XOR : a ^ 0 = a; a ^ a = 0;

Example: [4 1 2 1 2] ->[100 001 010 001 010]
step 1 : 100 ^ 001 -> 101
step 2 : 101 ^ 010 -> 111
step 3 : 111 ^ 001 -> 110
step 4 : 110 ^ 010 -> 100
result : 100 -> 4
*/

class Solution {
    public int singleNumber(int[] nums){
        int res = 0;
        for(int i : nums)
            res ^= i;
        return res;
    }
}