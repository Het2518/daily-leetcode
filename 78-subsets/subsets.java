class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());

        for (int num : nums) {
            int size = list.size();

            for (int i = 0; i < size; i++) {
                List<Integer> l = new ArrayList<>(list.get(i));
                l.add(num);
                list.add(l);
            }
        }

        return list;
    }
}