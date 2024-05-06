package week2;

public class EvenDuplicatesArray {
    static boolean isFound(int[] arr,int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array ={6,25,12,85,6,99,21,6,12,23,86,21,18,18,61,86,4,13,4};
        int[] evenDuplicate = new int[array.length];

        int evenIndex =0;
        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                if( (array[i] ==array[j] && array[i]%2==0 )) {
                        if ( ! isFound(evenDuplicate,array[i])) {
                            evenDuplicate[evenIndex ++] = array[i];
                        }
                        break;

                }
            }
        }
        System.out.print("Even duplicates : ");
       for (int value: evenDuplicate) {
           if (value != 0) {
               System.out.print(value + " , ");
           }
       }


    }
}
