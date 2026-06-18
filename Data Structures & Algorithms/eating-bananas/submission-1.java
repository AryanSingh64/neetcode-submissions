class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        // Find maximum pile
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int answer = right;

        while (left <= right) {

            int k = left + (right - left) / 2;

            long hours = 0;

            for (int pile : piles) {

                // Ceiling division
                hours += (pile + k - 1) / k;
            }

            if (hours <= h) {

                answer = k;
                right = k - 1; // try smaller speed
            }

            else {

                left = k + 1; // need faster speed
            }
        }

        return answer;
    }
}