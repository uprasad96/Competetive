#include<bits/stdc++.h>
using namespace std;
int main(){
  int H, U, D, F;
  while(scanf("%d %d %d %d", &H, &U, &D, &F), (H||U||D||F)){
    int day = 0;
    float currH = 0;
    float dayU = U;
    int nightD = D;
    float decr = U*(F/100.0);
    bool success = true;
    do{
      day++;

      currH += dayU;

      if(currH>H){
        success=true;
        break;
      }

      currH -= nightD;
      if(currH < 0){
        success=false;
        break;
      }

      dayU -= decr;
      if(dayU<0){
        dayU=0;
      }
    }
    while(true);
    if(success){
      cout<<"success on day "<<day<<"\n";
    }
    else{
      cout<<"failure on day "<<day<<"\n";
    }
  }
}
