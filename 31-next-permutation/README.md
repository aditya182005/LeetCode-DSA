<h2><a href="https://leetcode.com/problems/next-permutation">Next Permutation</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><p>A <strong>permutation</strong> of an array of integers is an arrangement of its members into a sequence or linear order.</p>

<ul>
	<li>For example, for <code>arr = [1,2,3]</code>, the following are all the permutations of <code>arr</code>: <code>[1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1]</code>.</li>
</ul>

<p>The <strong>next permutation</strong> of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the <strong>next permutation</strong> of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).</p>

<ul>
	<li>For example, the next permutation of <code>arr = [1,2,3]</code> is <code>[1,3,2]</code>.</li>
	<li>Similarly, the next permutation of <code>arr = [2,3,1]</code> is <code>[3,1,2]</code>.</li>
	<li>While the next permutation of <code>arr = [3,2,1]</code> is <code>[1,2,3]</code> because <code>[3,2,1]</code> does not have a lexicographical larger rearrangement.</li>
</ul>

<p>Given an array of integers <code>nums</code>, <em>find the next permutation of</em> <code>nums</code>.</p>

<p>The replacement must be <strong><a href="http://en.wikipedia.org/wiki/In-place_algorithm" target="_blank">in place</a></strong> and use only constant extra memory.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3]
<strong>Output:</strong> [1,3,2]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,2,1]
<strong>Output:</strong> [1,2,3]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,1,5]
<strong>Output:</strong> [1,5,1]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 100</code></li>
	<li><code>0 &lt;= nums[i] &lt;= 100</code></li>
</ul>

# Solution:
# Next Permutation Algorithm

## 🔹 Intuition
We need to rearrange numbers into the **next lexicographically greater permutation**.  
If no such permutation exists (i.e., the array is in descending order), we return the smallest permutation (sorted ascending).

Think of permutations as numbers:
- Example: `123 → 132 → 213 → 231 → 312 → 321`  
We want to find the "next" number in this sequence.

---

## 🔹 Approach
1. **Find the pivot (first decreasing element from the right):**
   - Traverse from right to left.
   - Find the first index `i` such that `nums[i] < nums[i+1]`.
   - This is the "pivot" where the next permutation change happens.

2. **If no pivot found:**
   - The array is in descending order (largest permutation).
   - Reverse the entire array to get the smallest permutation.

3. **Find the element just larger than pivot:**
   - Traverse from right to left again.
   - Find the first element greater than `nums[pivot]`.
   - Swap it with the pivot.

4. **Reverse the suffix:**
   - Reverse the part of the array after the pivot.
   - This ensures the suffix is the smallest possible order.

---

## 🔹 Time & Space Complexity
- **Time Complexity:**  
  - Finding pivot → `O(n)`  
  - Finding element to swap → `O(n)`  
  - Reversing suffix → `O(n)`  
  - **Overall:** `O(n)`

- **Space Complexity:**  
  - Only constant extra space for variables.  
  - **Overall:** `O(1)`

---

## 🔹 Example Walkthrough
### Input:nums = [1, 2, 3]

### Steps:
1. Find pivot:  
   - From right, `2 < 3` → pivot = index `1`.

2. Find element greater than pivot:  
   - From right, `3 > 2` → swap `2` and `3`.  
   - Array becomes `[1, 3, 2]`.

3. Reverse suffix after pivot:  
   - Reverse from index `2` to end.  
   - `[1, 3, 2]` → `[1, 3, 2]` (already sorted).

### Output:[1, 3, 2]
