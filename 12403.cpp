#include <bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  int Total=0;
  while(T--){
    string op;
    cin>>op;
    if(op=="donate"){
      char c =getchar();
      int dep;
      cin>>dep;
      Total+=dep;
    }
    else if(op=="report"){
      cout<<Total<<"\n";
    }
  }
}
