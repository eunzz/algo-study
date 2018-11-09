#include <stdio.h>

int main(void){
  // E S M 입력받기
  int e,s,m;
  scanf("%d %d %d", &e, &s, &m);

  int ie=1, is=1, im=1;
  int year=1;

  while (1){
    if (ie==e && is==s && im==m)  // 일치하면 loop 끝
      break;

    ie++;is++;im++;year++;

    if (ie>15)
      ie=1;
    if (is>28)
      is=1;
    if (im>19)
      im=1;
  }

  printf("%d\n",year);            // year 출력
  return 0;
}
