class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0;
        int b=1;
        int c=0;
        while(c<=n){
            
            c=a+b;
            if(a+b+c==n){
                return true;
            }
            a=b;
            b=c;
            
        }
               
        return false;
    }
}