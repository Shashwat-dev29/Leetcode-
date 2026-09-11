class Solution {
    int maxFrequency = 0;

    public int minimumIndex(List<Integer> nums) {
        int a = findMostFrequent(nums);

        int count = 0;

        for (int x = 0; x < nums.size() - 1; x++) {

            if (nums.get(x) == a) {
                count++;
            }

            int leftSize = x + 1;
            int rightSize = nums.size() - x - 1;
            int rightCount = maxFrequency - count;

            if (count * 2 > leftSize &&
                rightCount * 2 > rightSize) {
                return x;
            }
        }

        return -1;
    }

    public int findMostFrequent(List<Integer> numbers) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxElement = numbers.get(0);

        for (int num : numbers) {
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);

            if (count > maxFrequency) {
                maxFrequency = count;
                maxElement = num;
            }
        }

        return maxElement;
    }
}