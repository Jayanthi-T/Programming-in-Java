class EnhancedForLoop{
public static void main(String[] args){
int[] nums={3,4,-5,6,7}
int sum=0;
for(int num:nums){
sum+=num;
}
Sysyem.out.print("Sum= "+sum);
}
}

Output:
Sum= 25

(process
iteration 1------->3+4=7
iteration 2------->7+|-5|=12
iteration 3------->12+6=18
iteration 4------->18+7=25)
