package functionalprogram;

public class Sumoftripletiszero {
    static void findTriplets(int[] array, int length) {
        boolean found = false;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                        found = true;
                    }
                }
            }
        }
        // If no triplet with 0 sum found in array
        if (found == false)
            System.out.println(" Triplet not exist ");
    }

    public static void main(String[] args) {
        int arr[] = {0, 2, -3, 1};
        int length = arr.length;
        findTriplets(arr, length);
    }
}

