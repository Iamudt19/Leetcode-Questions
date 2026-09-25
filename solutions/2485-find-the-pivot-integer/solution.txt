class Solution {
    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++){
            if(i*(i+1)==(n*(n+1)/2)+i){
                return i;
            }
        }

        return -1;
    }
}