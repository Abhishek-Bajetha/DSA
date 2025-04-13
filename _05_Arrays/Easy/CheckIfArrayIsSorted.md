---
### Check if the Array is Sorted

#### Problem Statement

Given an array of integers, check whether the array is sorted in **non-decreasing** order. That is, every element should be less than or equal to the next element in the array.

You must return `true` if the array is sorted, and `false` otherwise.
---

### Examples

#### Example 1:

**Input:**

```python
arr = [1, 2, 2, 3, 4]
```

**Output:**

```
true
```

**Explanation:**  
All elements are in non-decreasing order.

#### Example 2:

**Input:**

```python
arr = [1, 3, 2]
```

**Output:**

```
false
```

**Explanation:**  
The number 2 comes after 3, which violates the non-decreasing order.

#### Example 3:

**Input:**

```python
arr = [5]
```

**Output:**

```
true
```

**Explanation:**  
A single element is always considered sorted.

---

### Constraints

- `1 <= arr.length <= 10^5`
- `-10^9 <= arr[i] <= 10^9`

### Expected Time Complexity

- `O(n)`

### Expected Space Complexity

- `O(1)`

---
