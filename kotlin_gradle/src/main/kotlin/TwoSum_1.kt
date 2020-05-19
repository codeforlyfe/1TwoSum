class TwoSum_1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val resultsArray = IntArray(2)

        for (index in 0..nums.size - 2) {
            val currentValue = nums[index]
            val remainder = target - currentValue
            val nextIndex = index + 1
            for (searchIndex in nextIndex until nums.size) {
                if (nums[searchIndex] == remainder) {
                    resultsArray[0] = index
                    resultsArray[1] = searchIndex
                    return resultsArray
                }
            }
        }

        return resultsArray
    }
}

