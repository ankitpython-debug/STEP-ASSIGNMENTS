class ClassAttendanceTracker {
    public static int[] trackAttendance(int[] attendance) {
        int present = 0;
        int longest = 0;
        int current = 0;

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] == 1) {
                present++;
                current++;

                if (current > longest) {
                    longest = current;
                }
            } else {
                current = 0;
            }
        }

        return new int[]{present, longest};
    }

    public static void main(String[] args) {
        int[] attendance = {1, 1, 0, 1, 1, 1, 0, 1};

        int[] result = trackAttendance(attendance);

        System.out.println("Present Days: " + result[0]);
        System.out.println("Longest Streak: " + result[1]);
    }
}
