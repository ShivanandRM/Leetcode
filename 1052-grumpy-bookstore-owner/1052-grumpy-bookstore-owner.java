class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int baseSatisfied = 0; 
         // Customers who are already satisfied
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                baseSatisfied += customers[i];
            }
        }

        // Extra customers in the first window
        int extraSatisfied = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                extraSatisfied += customers[i];
            }
        }

        int maxExtraSatisfied = extraSatisfied;

        // Slide the window
        for (int i = minutes; i < customers.length; i++) {

            // Remove the left element
            if (grumpy[i - minutes] == 1) {
                extraSatisfied -= customers[i - minutes];
            }

            // Add the new right element
            if (grumpy[i] == 1) {
                extraSatisfied += customers[i];
            }

            maxExtraSatisfied = Math.max(maxExtraSatisfied, extraSatisfied);
        }

        return baseSatisfied + maxExtraSatisfied;
    }
}