class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0;
        int b=1;
        int c=0;
        while(c<n){
            a=b;
            b=c;
            c=a+b;
        }
        if(c==n){
            return true;
        }        
        return false;
    }
}