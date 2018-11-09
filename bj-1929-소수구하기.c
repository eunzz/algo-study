#include <stdio.h>
#include <stdlib.h>

int *Eratos(int n){ //소수면 1 아니면 0
  int *arr = (int *)malloc(sizeof(int)*(n+1));
  int i,j;

  for (i=0; i<=n; i++){
    arr[i] = 1;
  }

  for (i=2; i*i<=n; i++){
    if (arr[i]==1){
      for (j=i*i; j<=n; j+=i){
        arr[j]=0;
      }
    }
  }

  return arr;
}

int main(void){
  int ini,fin;
  int i;
  scanf("%d %d", &ini, &fin);

  int *era = Eratos(fin);
  if (ini<2) ini=2;

  for (i=ini; i<fin+1; i++){
    if(era[i])
      printf("%d\n",i);
  }

  free(era);

  return 0;
}
