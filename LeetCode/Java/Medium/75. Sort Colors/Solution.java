class Solution {

    public void sortColors(int[] nums) {

        // Points to the position where the next 0 should be placed.
        int zeroIndex = 0;

        // Points to the current element being examined.
        int currentIndex = 0;

        // Points to the position where the next 2 should be placed.
        int twoIndex = nums.length - 1;

        while (currentIndex <= twoIndex) {

            if (nums[currentIndex] == 0) {

                // Move 0 to the left side.
                int temporaryValue = nums[currentIndex];
                nums[currentIndex++] = nums[zeroIndex];
                nums[zeroIndex++] = temporaryValue;

            } else if (nums[currentIndex] == 2) {

                // Move 2 to the right side.
                int temporaryValue = nums[currentIndex];
                nums[currentIndex] = nums[twoIndex];
                nums[twoIndex--] = temporaryValue;

                /*
                 * Do not increment currentIndex here because
                 * the value swapped from the right side has
                 * not been examined yet.
                 */

            } else {

                // The current value is 1, so it already
                // belongs in the middle section.
                currentIndex++;
            }
        }
    }
}