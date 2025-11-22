# Binary Tree Postorder Traversal (LeetCode 145)

## Problem Statement

Given the `root` of a binary tree, return the **postorder traversal** of its nodes' values.

In a postorder traversal, the nodes are visited in the following specific order:

1.  **Left**: Recursively traverse the left subtree.
2.  **Right**: Recursively traverse the right subtree.
3.  **Root**: Visit the current node.

## Examples

### Example 1:

**Input:**

```
root = [1, null, 2, 3]
```

**Output:**

```
[3, 2, 1]
```

**Explanation:**

1.  Traverse Left of 1 (null).
2.  Traverse Right of 1 (Node 2).
    - Inside Node 2: Left(3), Right(null), Root(2). Sequence so far: `3 -> 2`.
3.  Visit Root (1).
    - Final Sequence: `3 -> 2 -> 1`.

---

### Example 2:

**Input:**

```
root = [1, 2, 3, 4, 5]

       1
     /   \
    2     3
   / \
  4   5
```

**Output:**

```
[4, 5, 2, 3, 1]
```

**Explanation:**
The traversal follows Left -\> Right -\> Root:

1.  **Left Subtree (2)**:
    - Left(4) -\> Right(5) -\> Root(2). Sequence: `4, 5, 2`.
2.  **Right Subtree (3)**:
    - Left(null) -\> Right(null) -\> Root(3). Sequence: `3`.
3.  **Main Root (1)**.
    - Final Sequence: `4, 5, 2, 3, 1`.

---

## Constraints

- `0 <= Number of nodes <= 100`
- `-100 <= Node.val <= 100`

---
