class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int er=image.length;
        int ec= image[0].length;
        boolean arr[][]= new boolean [er][ec];
        solve(image,sr,sc,er,ec,image[sr][sc],color,arr);
        return image;
    }
    public void solve(int[][]image, int sr,int sc,int er,int ec, int cc,int nc,boolean[][] arr){

        if(sr<0||sc<0||sr>=er||sc>=ec||image[sr][sc]!=cc||arr[sr][sc])return ;
        arr[sr][sc]=true;
        image[sr][sc]=nc;
        int r[]={0,0,1,-1};
        int c[]={1,-1,0,0};
        for(int i=0;i<c.length;i++){
            solve(image,sr+r[i],sc+c[i],er,ec,cc,nc,arr);
        }
    }
}