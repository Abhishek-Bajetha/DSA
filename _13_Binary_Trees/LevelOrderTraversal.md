# Binary Tree Level Order Traversal (LeetCode 102)

## Problem Statement

Given the `root` of a binary tree, return the **level order traversal** of its nodes' values. (i.e., from left to right, level by level).

The result should be returned as a list of lists, where each inner list contains the values of the nodes at that specific depth.

## Examples

### Example 1:

**Input:**

```
root = [3, 9, 20, null, null, 15, 7]

    3
   / \
  9  20
    /  \
   15   7
```

**Output:**

```
[[3], [9, 20], [15, 7]]
```

**Explanation:**

  - **Level 0:** Contains only the root `3`.
  - **Level 1:** Contains children of 3: `9` and `20`.
  - **Level 2:** Contains children of 20: `15` and `7` (9 has no children).

-----

### Example 2:

**Input:**

```
root = [1]
```

**Output:**

```
[[1]]
```

-----

### Example 3:

**Input:**

```
root = []
```

**Output:**

```
[]
```

-----

## Constraints

  - `0 <= Number of nodes <= 2000`
  - `-1000 <= Node.val <= 1000`

-----