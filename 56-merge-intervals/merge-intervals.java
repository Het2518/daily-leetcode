class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int row = intervals.length;
        int[][] temp = new int[row][2];

        int index = 0;
        temp[index][0] = intervals[0][0];
        temp[index][1] = intervals[0][1];

        for (int i = 1; i < row; i++) {
            if (intervals[i][0] <= temp[index][1]) {
                temp[index][1] = Math.max(temp[index][1], intervals[i][1]);
            } else {
                index++;
                temp[index][0] = intervals[i][0];
                temp[index][1] = intervals[i][1];
            }
        }

        int[][] res = new int[index + 1][2];
        for (int i = 0; i <= index; i++) {
            res[i][0] = temp[i][0];
            res[i][1] = temp[i][1];
        }

        return res;
    }
}