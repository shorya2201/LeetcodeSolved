//Brute Force(Iterate through whole array every time to check wheather the element exists in it or not!)
class Solution {
    public int missingNumber(int[] nums) {
 int key = 0;
for(int i = 1;i<=nums.length;i++){
int flag = 0;
    for(int j = 0;j<nums.length-1;j++){
if(nums[j]==i){
    flag = 1;
    
}
    }
    if(flag ==0)
    key= i;
}

return key;
    }
}

//Better Approach(Use a Hash Array to flag numbers as 1 if found , then iterate through that array only once to check which index has value 0, thats our answer1)
class Solution {
    public int missingNumber(int[] nums) {
        int key=0;
int flag[] = new int[nums.length+1];

for(int i =0;i<nums.length;i++){
    flag[nums[i]]=1;
}
for(int i =1;i<flag.length;i++){
if(flag[i]==0){
    key=i;
}
}
return key;
    }
}

//Optimal Approach()
//1.XOR Solution (Best Preferred over Sum approach because it will not overflow the Integer limit)
class Solution {
    public int missingNumber(int[] nums) {
 int xor1 = 0;
 int xor2 = 0;
 int n = nums.length-1;
 for(int i = 0;i<nums.length;i++){
    xor2 = xor2^nums[i];
    xor1 = xor1^(i+1);
 }
 return xor1^xor2;
    }
}

//2.SUM Solution(Pre calculate the desired sum with all numbers and then calculate sum of elements of given array, the difference between both sum will be our answer)
class Solution {
    public int missingNumber(int[] nums) {

int n = nums.length;
 int sum =( n*(n+1))/2;
 int key = 0;
    int sum2 =0;
 for(int i =0;i<nums.length;i++){
    sum2 += nums[i] ;
 }
 return sum-sum2;
    }
}
