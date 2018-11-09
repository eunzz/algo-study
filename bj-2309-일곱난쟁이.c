#include <stdio.h>

int main(void){
  int arr[9];
  int i,j,k;
  int sum=0;

  for(k=0; k<9; k++){
    scanf("%d", &arr[k]);
    sum += arr[k];
  }

// 오름차순 정렬
  for (i=0; i<9; i++){
    for (j=i+1; j<9; j++){
      if (arr[i]>arr[j]){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
  }

// 합 100인 경우 찾기
  for (i=0; i<9; i++){
    for (j=i+1; j<9; j++){
      if (sum-arr[i]-arr[j] == 100)
        break;
    }
    if (sum-arr[i]-arr[j] == 100)
      break;
  }

// 출력
  for (k=0; k<9; k++){
    if (k!=i && k!=j)
      printf("%d\n", arr[k]);
  }

  return 0;
}
