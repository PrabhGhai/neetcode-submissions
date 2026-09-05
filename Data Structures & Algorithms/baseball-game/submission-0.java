class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        int[] temp = new int[n];
        int itr = 0;

        for (int i = 0; i < n; i++) {
            String op = operations[i];
            if (op.equals("+")) {
                temp[itr] = temp[itr - 1] + temp[itr - 2];
                itr++;
            } else if (op.equals("D")) {
                temp[itr] = 2 * temp[itr - 1];
                itr++;
            } else if (op.equals("C")) {
                itr--; // remove last score
            } else {
                temp[itr] = Integer.parseInt(op);
                itr++;
            }
        }

        int sum = 0;
        for (int j = 0; j < itr; j++) {
            sum += temp[j];
        }
        return sum;
    }
}
