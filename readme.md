# 1. Two Sum

Resource: https://leetcode.com/problems/two-sum

## Optimizing search unordered list
You can’t.

The best you can do is to break down the search tasks and use concurrency or parallelism to speed up the search task.
[Parallel Patterns Library (PPL) | Microsoft Docs](https://docs.microsoft.com/en-us/cpp/parallel/concrt/parallel-patterns-library-ppl?redirectedfrom=MSDN&view=vs-2019)

## Traverse array from the last index
Range operator only works incrementally.

```
// In Kotlin/Swift
// this works
1..10

// but this won't work
10..1
```

In Kotlin, you have to use `downTo`. In Swift, you have to use `stride`.

## Last index
Instead of writing `size - 1`, Kotlin has `lastIndex`  function. 

Swift doesn’t have it. Use `.count - 1`.

## Indices
Both Kotlin and Swift has `indices`. Useful for iteration.

