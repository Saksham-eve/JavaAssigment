#  Anonymous Array

An array in Java without any name is anonymous array.

## Code for Anonymous array
```javascript
class Test { 
    public static void main(String[] args) 
    { 
          // anonymous array 
          sum(new int[]{ 1, 2, 3 }); 
    } 
    public static void sum(int[] a) 
    { 
        int total = 0; 
  
        // using for-each loop 
        for (int i : a)  
            total = total + i; 
          
        System.out.println("The sum is:" + total); 
    } 
} 
```
## Output
The sum is 6