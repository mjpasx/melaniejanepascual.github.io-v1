//Write a function that takes in an integer N and returns the sum for all numbers between 1 to N excluding multiples of 3 and 5.*/

int sum(N){
     int x = 0;
     int sum = 0;
     while(x <= N){
          if((x%3 != 0) && (x%5 != 0)){
               sum += x;
               x++;
          }
     }
     return sum;
}


//Given an array of  integers and a number,n,
// perform  left rotations on the array. Then 
//print the updated array as a single line of space-separated integers.

public static int[] arrayLeftRotation(int[] a, int n, int k) {
	
}


//Given a string, print out all of the unique characters and the 
//number of times it appeared in the string

example: joyful