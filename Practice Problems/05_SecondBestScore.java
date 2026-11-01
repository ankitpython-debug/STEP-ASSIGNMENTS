
class SecondBestScore {
    public static int findSecondBest(int[] scores) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highest) {
                secondHighest = highest;
                highest = scores[i];
            } else if (scores[i] > secondHighest && scores[i] != highest) {
                secondHighest = scores[i];
            }
        }

        if (secondHighest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondHighest;
    }

    public static void main(String[] args) {
        int[] scores = {45, 78, 92, 78, 60};

        int result = findSecondBest(scores);

        System.out.println("Second-Best Score: " + result);
    }
}
