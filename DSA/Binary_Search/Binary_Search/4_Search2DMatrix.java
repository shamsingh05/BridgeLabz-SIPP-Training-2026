public class Search2DMatrix {
    public static boolean search(int[][] matrix,int target){
        int rows=matrix.length, cols=matrix[0].length;
        int left=0,right=rows*cols-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int val=matrix[mid/cols][mid%cols];
            if(val==target) return true;
            if(val<target) left=mid+1;
            else right=mid-1;
        }
        return false;
    }
}