class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
    static void findCombination(int index, int[] arr, int target,
                                List<Integer> ds,
                                List<List<Integer>> ans) {
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (arr[index] <= target) {
            ds.add(arr[index]);
            findCombination(index, arr, target - arr[index], ds, ans);
            ds.remove(ds.size() - 1);
        }
        findCombination(index + 1, arr, target, ds, ans);
    }
}