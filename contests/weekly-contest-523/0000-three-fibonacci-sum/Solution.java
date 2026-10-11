class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0;
        int b=1;
        int c=0;
        while(c<=n){
            c=a+b;
            a=b;
            b=c;
            if(a+b+c==n){
                return true;
            }
        }
               
        return false;
    }
}