class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] frequency = new int[size + 1];
        int[] result = new int[2];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                int value = grid[i][j];
                frequency[value]++;
            }
        }
        for(int i = 1; i <= size; i++)
        {
            if(frequency[i] == 2) result[0] = i;
            if(frequency[i] == 0) result[1] = i;
        }
        return result;
    }
}