class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }

    public void mergesort(int arr[],int s,int e){
        if(s >= e){
            return;
        }
        int m = (s + e)/2;
        mergesort(arr,s,m);
        mergesort(arr,m+1,e);
        merge(arr,s,m,e);
    }

    public void merge(int arr[],int s,int m, int e){
        ArrayList<Integer> temp = new ArrayList<>();
        int i=s;
        int j=m+1;

        while(i<=m && j <= e){
            if(arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                temp.add(arr[j]);
                j++;
            }
            
        }
        while(i <= m){
            temp.add(arr[i]);
            i++;
        }
        while(j<=e){
            temp.add(arr[j]);
            j++;
        }

        for( i = s;i<=e;i++){
            arr[i] = temp.get(i-s);
        }
    }
}