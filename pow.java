//Time Complexity: O(logn)
//Space Complexity: O(logn) recursion stack
class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }

        double temp = myPow(x, n/2);
        if(n%2 == 0){
            return temp * temp;
        }
        else{
            if(n < 0){
                return temp * temp * (1/x);
            }
            else{
                return temp * temp * x;
            }
        }
    }
} 