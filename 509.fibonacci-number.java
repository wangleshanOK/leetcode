/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        if( n == 0){
            return 0 ;
        }
        if(n ==1|| n == 2 ){
            return 1;
        }
        int curr = 1;
        int pre = 1;
        for(int i = 3;i<=n;i++){
            int num = curr+ pre;
            pre = curr;
            curr = num;
        }
        return curr;
    }
}
// @lc code=end

