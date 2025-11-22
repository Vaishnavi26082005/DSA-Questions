class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m= grid[0].length;
        boolean[][] arr= new boolean [n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!='0'&&!arr[i][j]){
                dfs(grid, arr,i, j, n, m);
                count++;}
            }
        }
        return count;
    }
    public void dfs(char[][] grid,boolean [][] arr,int i,int j,int n,int m){
        if(i<0||j<0||i>=n||j>=m||grid[i][j]=='0'||arr[i][j])return ;
        arr[i][j]=true;
        int r[]={0,0,-1,1};
        int c[]={1,-1,0,0};
        for(int k=0;k<r.length;k++){
            dfs(grid,arr,i+r[k],j+c[k],n,m);
        }
    }
}