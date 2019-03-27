#### 191 Number of 1 Bits

### Description:

Write a function that takes an unsigned integer and return the number of '1' bits it has (also known as the Hamming weight).

Example 1:

    Input: 00000000000000000000000000001011
    Output: 3
    Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.

### My solution:

Using Binary conversion to solve the problem. 

    ```Java
    String str = Integer.toBinaryString(n);
    ```
    

      Time complexity: O(n)
      Space complexity: O(n)
      
### Best solution:

Using Bit Manipulation Trick. Until number equal to 0, using n & (n-1) to change the last 1 bit to 0; Count times.

Example: 

     n : 001011
     n-1:001010
    ------------
    n    001010 (Change the last 1 bit to 0) 
    n-1  001001
    -----------
    n    001000
    n-1  000111
    -----------
         000000 (count times)   
    
    Time complexity: O(1)
    Space complexity: O(1)