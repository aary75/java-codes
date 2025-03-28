//Minimum Array
// class min1{
// public void min(int arr[]){
//     int min = arr[0];
//     for(int i=0;i<arr.length;i++){
//        if(min > arr[i]){
//         min = arr[i];
//        }
//     }
//     System.out.println(min);
// }}

// public class Array{
//     public static void main(String args[]){
//         min1 sq = new min1();
//         int arr[] = {2,3,4,5,6};
//         sq.min(arr);
//     }
// }

//Anonomoyous Array
// class TestArray{
//     static void printArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// public class Array{
//     public static void main(String args[]){
//         TestArray sq = new TestArray();
//         sq.printArray(new int[]{2,3,4,5,6});
//     }
// }

public class Array{
    static int[] get(){
        return new int[]{10,20,30,40,50};
    }

    public static void main(String args[]){
        int arr[] = get();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}