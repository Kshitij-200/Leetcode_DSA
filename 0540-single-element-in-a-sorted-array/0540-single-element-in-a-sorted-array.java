class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> elementFrequencyMap = new HashMap<>();

        
        for (int element : nums) {
            if (elementFrequencyMap.containsKey(element)) {
                int frequency = elementFrequencyMap.get(element);
                elementFrequencyMap.put(element, frequency + 1);
            } else {
                elementFrequencyMap.put(element, 1);
            }
        }
        for (int element : nums) {
            if (elementFrequencyMap.get(element) == 1) {
                return element;
            }
        }
        return -1;
    }
}