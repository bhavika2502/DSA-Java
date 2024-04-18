public class Binary {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target = 13;
        int st = 0, end = arr.length - 1;
        boolean falg = true;
        while(st<=end)
        {
            int mid = st+(end-st)/2;
            if (arr[mid] == target)
            {
                System.out.println("Element is present in the search space");
                falg = false;
                break;
            }
            else if (arr[mid]<target)
            {
                st = mid+1;
            }
            else
            {
                end = mid - 1;
            }
            
        }
        if (falg) System.out.println("Element is not present in the search space");

    }
   
}
