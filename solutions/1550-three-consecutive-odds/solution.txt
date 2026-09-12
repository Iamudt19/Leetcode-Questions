class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                c--;
            }
            else{
                c=3;
            }
            if(c==0){
                return true;
            }

        }
        return false;
    }
}
