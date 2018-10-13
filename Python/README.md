# Python Search Algorithm
## Binary search
- A serch algoithm to find an element in a **sorted** array
- Efficiency: O(log(n))

### Steps
1. Compare the target value to the middle element of the array.
2. If the values are not equal, compare the target value to the middle element of the remaining half which always potaintially contains the element.
3. Repeat step 2, until the element is found or the remaining half array is empty.

### Result table for calculating efficiency

| **Array size** | 0 |   1   |   2   | 3 |   4   | 5 | 6 | 7 |   8   |
|----------------|---|-------|-------|---|-------|---|---|---|-------|
| **Iterations** | 0 | **1** | **2** | 2 | **3** | 3 | 3 | 3 | **4** | 

##### Example
Search element **4** in an array = [1, 2, 3]
-> middle: 2, rest: [3]
-> middle: 3, rest:[] 
So it requres **2** iterations in an array with 3 elements in the worst case.

Search element **5** in an array = [1, 2, 3, 4]
When the number of the elements is even, we need to decide whether side should be used.
In this case, we use the lower side.
-> middle: 2, rest: [3, 4] 
-> middle: 3, rest: [4] 
-> middle: 4, rest: []
So it requres **3** iterations in an array with 3 elements in the worst case.

Search element **8** in an array = [1, 2, 3, 4, 5, 6, 7, 8]
-> middle: 4, rest: [5, 6, 7, 8] 
-> middle: 6, rest: [7, 8] 
-> middle: 7, rest: [8]
-> middle: 8, rest: []
So it requres **4** iterations in an array with 3 elements in the worst case.

##### Calculation
We could find a pattern in the result table as below.

|  Array size  | 1 | 2 | 4 | 8 |
|--------------|---|---|---|---|
**Iterations** | 1 | 2 | 3 | 4 | 

The iteration can be expressed as
<p align="center">
    <img src="https://latex.codecogs.com/gif.latex?\log_{2}(n)&plus;1">
</p>



