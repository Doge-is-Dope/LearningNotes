# Python Search and Sort Algorithm

- [Binery Search](https://github.com/Chun-Chieh/LearningNotes/tree/master/Python#binary-search)
- [Bubble Sort]()

## Binary search
- A serch algoithm to find an element in a **sorted** array
- Efficiency: ![](https://latex.codecogs.com/gif.latex?O\left&space;(&space;\left&space;\log&space;n&space;\right&space;))

### Steps
1. Compare the target value to the middle element of the array.
2. If the values are not equal, compare the target value to the middle element of the remaining half which always potaintially contains the element.
3. Repeat step 2, until the element is found or the remaining half array is empty.

### Results table for calculating the efficiency
| **Array size** | 0 |   1   |   2   | 3 |   4   | 5 | 6 | 7 |   8   |
|----------------|---|-------|-------|---|-------|---|---|---|-------|
| **Iterations** | 0 | **1** | **2** | 2 | **3** | 3 | 3 | 3 | **4** | 

#### Example
Search element **4** in an array = [1, 2, 3]<br />
-> middle: 2, rest: [3]<br />
-> middle: 3, rest:[]<br /> 
So it requres **2** iterations in an array with 3 elements in the worst case.
<br />
<br />
Search element **5** in an array = [1, 2, 3, 4]<br />
When the number of the elements is even, we need to decide whether side should be used.
In this case, we use the lower side.<br />
-> middle: 2, rest: [3, 4]<br />
-> middle: 3, rest: [4]<br />
-> middle: 4, rest: []<br />
So it requres **3** iterations in an array with 3 elements in the worst case.
<br />
<br />
Search element **8** in an array = [1, 2, 3, 4, 5, 6, 7, 8]<br />
-> middle: 4, rest: [5, 6, 7, 8]<br />
-> middle: 6, rest: [7, 8]<br />
-> middle: 7, rest: [8]<br />
-> middle: 8, rest: []<br />
So it requres **4** iterations in an array with 3 elements in the worst case.<br />

#### Calculation
We could find a pattern in the result table as below.


|  Array size  | 1 | 2 | 4 | 8 |
|--------------|---|---|---|---|
**Iterations** | 1 | 2 | 3 | 4 |


Thus, the iteration can be expressed as

<p align="center">
    <img src="https://latex.codecogs.com/gif.latex?\log_{2}(n)&plus;1">
</p>

### Reference


[Visualization](https://www.cs.usfca.edu/~galles/visualization/Search.html)


## Bubble sort
- Bubble up the element to the an array
- Worst: ![](https://latex.codecogs.com/gif.latex?\left&space;O(&space;n^{2}&space;\right&space;))
- Average: ![](https://latex.codecogs.com/gif.latex?\left&space;O(&space;n^{2}&space;\right&space;))
- Best: ![](https://latex.codecogs.com/gif.latex?\left&space;O(&space;n&space;\right&space;))
- Space: ![](https://latex.codecogs.com/gif.latex?O\left&space;(&space;1&space;\right&space;)) ---In-place sorting algorithm

### Results table for calculating the efficiency
| **Iteration No**      |  0  |  1  |  2  |  3  |  4  |  5  |...|n - 1|
|-----------------------|-----|-----|-----|-----|-----|-----|---|-----|
| **No of Comparisons** |n - 1|n - 1|n - 1|n - 1|n - 1|n - 1|...|n - 1|

#### Calculation
Thus, the worst case can be expressed as  ![](https://latex.codecogs.com/gif.latex?\left&space;(&space;n-1&space;\right&space;)\ast&space;\left&space;(&space;n-1&space;\right&space;)=&space;n^{2}-2n&plus;1)


## Merge sort
- Divide & conquer

