// Forward declaration of isBadVersion API.
bool isBadVersion(int version);

int firstBadVersion(int n) {
    int low=1,high=n,mid,target=1;
    if(isBadVersion(low)){
        return low;
    }
    while(low<=high){
         mid=low+(high-low)/2;
         if(isBadVersion(mid)){
             high=mid-1;
             target=mid;
         }else{
             low=mid+1;
         }
    }
    return target;
}
