
class ExamScoreBandCounter {
    public static int lowerBound(int[] arr, int low) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < low) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static int upperBound(int[] arr, int high) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= high) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static int countInRange(int[] arr, int low, int high) {
        return upperBound(arr, high) - lowerBound(arr, low);
    }

    public static void main(String[] args) {
        int[] scores = {40, 50, 60, 60, 70, 80, 90};
        int low = 60;
        int high = 80;

        int result = countInRange(scores, low, high);

        System.out.println("Scores in range: " + result);
    }
}
