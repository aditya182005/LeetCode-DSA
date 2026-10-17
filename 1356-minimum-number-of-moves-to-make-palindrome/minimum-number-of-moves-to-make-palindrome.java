class Solution {
    public int minMovesToMakePalindrome(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length-1;
        int moves = 0;
        while(left < right)
        {
            int l = left, r = right;
            while(arr[r] != arr[l] && r > l) r--;
            if(l == r) 
            {
                swap(arr, r, r+1);
                moves++;
                continue;
            }
            else
            {
                for(int i = r; i < right; i++)
                {
                    swap(arr, i, i+1);
                    moves++;
                }
                left++;
                right--;
            }
        }
        return moves;
    }
    private void swap(char[] arr, int i, int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}