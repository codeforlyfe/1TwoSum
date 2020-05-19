class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        var dictionary: [Int: Int] = [:]

        for index in nums.indices {
            let complement = target - nums[index]
            if (dictionary[complement] != nil) {
                return [dictionary[complement]!, index]
            }
            dictionary[nums[index]] = index
        }
        return []
    }
}

let target = 9
let nums = [2, 7, 11, 15]

let result = Solution().twoSum(nums, target)
result.forEach {
    print("\($0)")
}
