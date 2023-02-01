Q1. Reorder Items
<br />
We have an array of unique integers like [45,32,12,78,13]<br />
An operation on the array is defined by the pair of positive integers (a,b) which means the number after 'a' is moved to after 'b'.<br />
For eg, if the operation is 32 13 the resulting array after the operation is [45,32,78,13,12]

Your program should take input in the follwing format

N -> size of the array
A1 A2 .... AN -> elements of array
M -> number of operations
a1 b1
a2 b2
| |
| |
aM bM
The program should print the resulting array after all the operations are done.
Eg:

5
45 32 12 78 13
1
32 13
Output

45 32 78 13 12

<br />

<h3> NOT ASKED </h3>
Q2. Find the number

[We have an array which is sorted like A = [1,2,3,4,5,6,7,13,17] <br />
]()Some elements are swapped with their adjacent element. An element can be swapped only once. <br />
Let's say 1 and 2 are swapped. The array becomes [2,1,3,4,5,6,7,13,17]. Now 2 and 1 cannot be swapped again as each element cannot be swapped more than once. Let's say array undergoes some operations some number of times and becomes [2,1,3,5,4,7,6,13,17].
You have to find a number k in the array.

Input

N -> the size of the array
a1 a2 a3 .... an -> elements of the array which was sorted and some elements are swapped with theri adjacent elements
K -> number to find in array
output

J -> index of element in the array or -1 if not present
Eg

9
2 1 3 5 4 7 6 13 17
1
output

1