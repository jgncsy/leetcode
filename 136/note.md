#### 136

### Description:

Given a **non-empty** array of integers, every element appears twice except for one. Find that single one.

**Note:**

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
Example 1:

    Input: [2,2,1]
    Output: 1

Example 2:

    Input: [4,1,2,1,2]
    Output: 4

### My solution:

Using Math to find the single number. 
      sumset = (a + b + c ),
      sum = (a + a + b + b + c),
      singlenumber = 2 * sumset - sum
      
      Time complexity: O(n + n + n) = O(n)
      Space complexity: O(1 + n + 1) = O(n)
      
### Best solution:

using XOR operator: a ^ 0 = a; a ^ a = 0;

Example: 

    [4 1 2 1 2] ->[100 001 010 001 010]
    step 1 : 100 ^ 001 -> 101
    step 2 : 101 ^ 010 -> 111
    step 3 : 111 ^ 001 -> 110
    step 4 : 110 ^ 010 -> 100
    result : 100 -> 4
    
    Time complexity: O(1 + n) = O(n)
    Space complexity: O(1) = O(1)