// This solution doesn't work. O(n²), time limit exceeded.

class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        for index in nums.indices {
            for nextIndex in stride(from: nums.endIndex - 1, to:index, by: -1) {
                if (nums[index] + nums[nextIndex] == target) {
                    return [index, nextIndex]
                }
            }
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
