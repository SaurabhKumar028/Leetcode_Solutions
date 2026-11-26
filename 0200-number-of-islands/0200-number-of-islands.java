class Solution {

    static void helper(char[][] grid, int i, int j) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
        return;
    }
    
    grid[i][j] = '0';
    
    helper(grid, i + 1, j);
    helper(grid, i - 1, j);
    helper(grid, i, j + 1);
    helper(grid, i, j - 1);
}
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    count++;
                   helper(grid, i, j);
                }
            }
        }
        
        return count;
    }
}
