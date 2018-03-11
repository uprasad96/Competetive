#include <bits/stdc++.h>
using namespace std;
int main(){
  int a,b;
  while(scanf("%d %d",&a, &b), (a!=-1 && b!=-1)){
    int small=b,large=a;
    if(a<b){
      small=a;
      large=b;
    }
    cout<<min((large-small),(100-large+small))<<"\n";
  }
}
