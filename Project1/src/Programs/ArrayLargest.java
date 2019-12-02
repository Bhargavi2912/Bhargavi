package Programs;

public class ArrayLargest {

    public static int getSecondLargest(int[] arr, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[total - 2];
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 5, 6, 3, 2 };
        int b[] = { 44, 66, 99, 77, 33, 22, 55 };
        System.out.println("Second Largest: " + getSecondLargest(a, 6));
        System.out.println("Second Largest: " + getSecondLargest(b, 7));
    }
}













//    int arr[] ;
//    int temp;
//
//    void arraylarge(){
//        for(int i =0; i<arr.length; i--){
//            for(int j=i+1; j<arr.length; j--){
//                if(arr[i] > arr[j]){
//                  temp = arr[i];
//                  arr[i] = arr[j];
//                  arr[j] = temp;
//                }
//            }
//        }
//
//    }
//    public static void main(String arg[]){
//       int arr[] = {2,6,9,5,4,8,1};
//       for(int i=0; i<arr.length; i++){
//           System.out.println(arr[i]);
//       }
//    }
//}
