# Binary Tree Preorder Traversal (LeetCode 144)

## Problem Statement

Given the `root` of a binary tree, return the **preorder traversal** of its nodes' values.

In a preorder traversal, the nodes are recursively visited in the following order:

1.  **Root**: Visit the current node.
2.  **Left**: Traverse the left subtree.
3.  **Right**: Traverse the right subtree.

[Image of binary tree preorder traversal]

## Examples

### Example 1:

**Input:**

```
root = [1, null, 2, 3]
```

**Output:**

```
[1, 2, 3]
```

**Explanation:**

1.  Visit Root (1).
2.  Left child is null.
3.  Visit Right child (2).
4.  Visit Left child of 2 (3).

---

### Example 2:

**Input:**

```
root = [1, 2, 3, 4, 5]
```

**Output:**

```
[1, 2, 4, 5, 3]
```

**Explanation:**
The traversal path is: `1 -> 2 -> 4 -> 5 -> 3`.

---

## Constraints

- `0 <= Number of nodes <= 100`
- `-100 <= Node.val <= 100`

---
