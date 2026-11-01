class BusiestBusRow {
    public static int[] busiestRow(int[][] grid) {
        int maxSum = -1;
        int rowIndex = 0;

        for (int i = 0; i < grid.length; i++) {
            int sum = 0;

            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                rowIndex = i;
            }
        }

        return new int[]{rowIndex, maxSum};
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2, 0, 1},
            {3, 3, 1},
            {1, 1, 1}
        };

        int[] result = busiestRow(grid);

        System.out.println("Row: " + result[0]);
        System.out.println("Total: " + result[1]);
    }
}
