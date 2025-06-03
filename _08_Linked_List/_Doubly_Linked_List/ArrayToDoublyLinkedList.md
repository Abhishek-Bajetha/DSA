---

# Convert Array to Doubly Linked List

## Problem Statement

You are given an integer array `arr[]` of size `n`. Your task is to convert this array into a **Doubly Linked List** where:

* Each element in the array becomes a node in the list.
* Each node contains three fields: `data`, `prev`, and `next`.
* The head node of the linked list corresponds to the first element of the array.
* The list should be connected in both directions using `prev` and `next` pointers.

Return the **head node** of the constructed doubly linked list.

---

## Example

### Input:

```
arr = [10, 20, 30, 40, 50]
```

### Output:

```
Doubly Linked List:
null <- 10 <-> 20 <-> 30 <-> 40 <-> 50 -> null
```

---

## Constraints

- `1 <= arr.length <= 10^4`
- `-10^5 <= arr[i] <= 10^5`

---

## Notes

- Do not use Java's built-in `LinkedList` or `ArrayList`.
- You should define your own `Node` class with fields for `int data`, `Node next`, and `Node prev`.
- You may write a helper function to print the list forward and backward for testing purposes.

---
