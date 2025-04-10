---
## Question: Count Frequency of Each Element in the Array

### Problem Statement

Given an array of integers, count the frequency of each unique element present in the array using hashing techniques.
---

### Description

You are given an integer array. Your task is to use hashing to determine how many times each element occurs in the array. Output the frequency count of each unique element.

You can use a hash map (such as `unordered_map` in C++, `HashMap` in Java, or a dictionary in Python) to store and update frequencies.

> 💡 **You should also try solving this problem _without_ using built-in hash map or dictionary libraries.**  
> This will help you understand the core concept of hashing and how it works internally.

---

### Example

**Input:**

```
arr = [10, 5, 10, 15, 10, 5]
```

**Output:**

```
10 -> 3
5  -> 2
15 -> 1
```

**Explanation:**

- 10 appears 3 times
- 5 appears 2 times
- 15 appears 1 time

---

### Constraints

- `1 <= arr.length <= 10^5`
- `-10^9 <= arr[i] <= 10^9`

---

### Expected Time Complexity

- `O(N)`

### Expected Space Complexity

- `O(N)` — due to the use of a hash map (or similar structure) to store frequencies.

---
