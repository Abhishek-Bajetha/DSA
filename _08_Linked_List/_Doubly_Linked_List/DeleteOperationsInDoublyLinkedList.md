---

# Delete Operations in a Doubly Linked List

## Problem Statement

You are given a **Doubly Linked List** and asked to implement several deletion operations. A doubly linked list is a type of linked list in which each node contains three fields: `data`, `next`, and `back`. You need to perform the following deletion operations:

### 1. Delete the Head Node

Remove the first node (head) of the doubly linked list.

### 2. Delete the Tail Node

Remove the last node (tail) of the doubly linked list.

### 3. Delete the Kth Node

Remove the node at the given position `k` (1-based index) in the doubly linked list.

You should handle edge cases such as:

- Deleting from an empty list
- Deleting the only node in the list
- Deleting the head or tail specifically

---

## Example

### Input:

```
Initial List: 10 <-> 20 <-> 30 <-> 40
Operations:
- Delete Head
- Delete Tail
- Delete 2nd Node
```

### Output:

```
After Delete Head: 20 <-> 30 <-> 40
After Delete Tail: 20 <-> 30
After Delete 2nd Node: 20
```

---

## Constraints

- `1 <= k <= length of the list`
- The linked list may initially be empty or contain any number of nodes.

---

