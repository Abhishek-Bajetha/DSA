# Binary Tree Inorder Traversal (LeetCode 94)

## Problem Statement

Given the `root` of a binary tree, return the **inorder traversal** of its nodes' values.

In an inorder traversal, the nodes are visited in the following specific order:

1.  **Left**: Recursively traverse the left subtree.
2.  **Root**: Visit the current node.
3.  **Right**: Recursively traverse the right subtree.

[Image of binary tree inorder traversal]

## Examples

### Example 1:

**Input:**

```
root = [1, null, 2, 3]
```

**Output:**

```
[1, 3, 2]
```

**Explanation:**

1.  Traverse Left of 1 (It is null).
2.  Visit Root (1).
3.  Traverse Right of 1 (Node 2).
      - Inside Node 2: Traverse Left (3).
      - Visit Root (2).
      - Traverse Right (null).

-----

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
[4, 2, 5, 1, 3]
```

**Explanation:**
The traversal follows Left -\> Root -\> Right:

1.  Left Subtree (2): Left(4) -\> Root(2) -\> Right(5).
2.  Main Root (1).
3.  Right Subtree (3): Left(null) -\> Root(3) -\> Right(null).

-----

## Constraints

  - `0 <= Number of nodes <= 100`
  - `-100 <= Node.val <= 100`

-----
