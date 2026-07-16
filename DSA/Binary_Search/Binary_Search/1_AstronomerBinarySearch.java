public class AstronomerBinarySearch {
    public static int binarySearch(int[] arr,int target){
        int l=0,r=arr.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==target) return m;
            if(arr[m]<target) l=m+1;
            else r=m-1;
        }
        return -1;
    }
    public static int searchRotated(int[] arr,int target){
        int l=0,r=arr.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==target) return m;
            if(arr[l]<=arr[m]){
                if(target>=arr[l]&&target<arr[m]) r=m-1;
                else l=m+1;
            }else{
                if(target>arr[m]&&target<=arr[r]) l=m+1;
                else r=m-1;
            }
        }
        return -1;
    }
    public static int firstOccurrence(int[] arr,int t){
        int l=0,r=arr.length-1,ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]>=t){ if(arr[m]==t) ans=m; r=m-1; }
            else l=m+1;
        }
        return ans;
    }
    public static int lastOccurrence(int[] arr,int t){
        int l=0,r=arr.length-1,ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]<=t){ if(arr[m]==t) ans=m; l=m+1; }
            else r=m-1;
        }
        return ans;
    }
    public static int findMin(int[] arr){
        int l=0,r=arr.length-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(arr[m]>arr[r]) l=m+1;
            else r=m;
        }
        return arr[l];
    }
}