class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val resultsArray = IntArray(2)
        val numsMap = mutableMapOf<Int, Int>()

        for (index in nums.indices) {
            val complement = target - nums[index]
            if (numsMap[complement] != null) {
                resultsArray[0] = numsMap[complement]!!
                resultsArray[1] = index
            }

            numsMap[nums[index]] = index
        }

        return resultsArray
    }
}

