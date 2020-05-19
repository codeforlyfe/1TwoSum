import junit.framework.TestCase.assertTrue
import org.junit.Test

class TwoSumTest {

    @Test
    fun `1`() {
        // Given
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9

        // When
        val result = TwoSum().twoSum(nums, target)

        // Then
        val expectedResult = intArrayOf(0, 1)
        assertTrue(expectedResult.contentEquals(result))
    }


    @Test
    fun `2`() {
        // Given
        val nums = intArrayOf(3, 2, 4)
        val target = 6

        // When
        val result = TwoSum().twoSum(nums, target)

        // Then
        val expectedResult = intArrayOf(1, 2)
        assertTrue(expectedResult.contentEquals(result))
    }
}
