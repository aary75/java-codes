public class inheritenc {
    public static void main(String[] args) {
        
        int[] arr = {1,2,4,9,10,12};
        int i = 0;
        int j = arr.length-1;
        int target = 14;

        while(i < j){
            int sum = arr[i] + arr[j];

            if(sum < target){
                i++;
            }
            else if(sum > target){
                j--;
            }
            else{
                System.out.print(arr[i]+" "+arr[j]);
                i++;
                j--;
            }
        }
    }
}
