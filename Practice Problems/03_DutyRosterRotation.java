
class DutyRosterRotation {
    public static String[] rotateRight(String[] names, int k) {
        int n = names.length;
        String[] result = new String[n];

        if (n == 0) {
            return result;
        }

        k = k % n;

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = names[i];
        }

        return result;
    }

    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};
        int k = 2;

        String[] result = rotateRight(names, k);

        System.out.print("Rotated Roster: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
