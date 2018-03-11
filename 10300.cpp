#include <bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  while(T--){
    int F;
    cin>>F;
    int sum=0;
    while(F--){
      int a,b,c;
      cin>>a>>b>>c;
      sum+= (a*c);
    }
    cout<<sum<<"\n";
  }
  return 0;
}
