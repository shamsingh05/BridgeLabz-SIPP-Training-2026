public class FirstLastOccurrence {
    static int first(int[] arr,int t){
        int l=0,r=arr.length-1,ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]>=t){ if(arr[m]==t) ans=m; r=m-1; }
            else l=m+1;
        }
        return ans;
    }
    static int last(int[] arr,int t){
        int l=0,r=arr.length-1,ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]<=t){ if(arr[m]==t) ans=m; l=m+1; }
            else r=m-1;
        }
        return ans;
    }
}