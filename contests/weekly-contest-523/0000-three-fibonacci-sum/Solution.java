class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0;
        int b=1;
        int c=0;
        while(c<=n){
            if(a+b+c==n){
                return true;
            }
            c=a+b;
            a=b;
            b=c;
            
        }
               
        return false;
    }
}