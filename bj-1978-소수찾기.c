#include <stdio.h>

int is_prime(int num){
  int i;
  if (num<2) return 0;
  for (i=2; i*i<=num; i++){
    if (num%i ==0)
      return 0;
  }
  return 1;
}

int main(void){
  int nums[100];
  int n, i;
  int r=0;

  scanf("%d", &n);

  for (i=0; i<n; i++){
    scanf("%d", &nums[i]);
  }

  for (i=0; i<n; i++){
    if(is_prime(nums[i]))
      r++;
  }
  printf("%d\n",r);

  return 0;
}
