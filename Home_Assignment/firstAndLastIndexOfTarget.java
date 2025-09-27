public class firstAndLastIndexOfTarget {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] result = search(arr, target);
        System.out.println("[" + result[0] + "," + result[1] + "]"); // Output: [3, 4]
    }

    public static int[] search(int[] arr, int target) {
        int first = binarySearch(arr, target,true);
        int last = binarySearch(arr, target, false);
        return new int[]{first, last};
    }

    public static int binarySearch(int[] arr, int target, boolean findFirst) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid;
                if (findFirst) {
                    end = mid - 1; // Look on the left side
                } else {
                    start = mid + 1; // Look on the right side
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }
}
