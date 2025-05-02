---

# First and Last Occurrence in a Sorted Array

## Problem Statement

Given a sorted array of integers and a target value, find the first and last positions (indices) of the target element in the array.

If the target element is not present in the array, return `-1` for both positions.

Your implementation should ideally use a binary search-based approach for better efficiency.

## Example

### Example 1:
**Input:**
```
arr = [2, 4, 4, 4, 5, 6], target = 4
```
**Output:**
```
First Occurrence: 1  
Last Occurrence: 3
```

### Example 2:
**Input:**
```
arr = [1, 2, 3, 4, 5], target = 6
```
**Output:**
```
First Occurrence: -1  
Last Occurrence: -1
```

## Constraints

- `1 <= arr.length <= 10^5`
- `-10^9 <= arr[i], target <= 10^9`
- The array is sorted in non-decreasing order.

---
