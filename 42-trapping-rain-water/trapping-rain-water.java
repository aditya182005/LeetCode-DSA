class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int Lmax=0,Rmax=0,left=0,right=n-1,total=0;
        while(left<right){
            if(height[left]<height[right]){
                if(Lmax>height[left]){
                    total+=Lmax-height[left];
                }
                else{
                    Lmax=height[left];
                }
                left++;
            }
            else{
                if(Rmax>height[right]){
                    total+=Rmax-height[right];
                }
                else{
                    Rmax=height[right];
                }
                right--;
            }
        }
        return total;
    }
}