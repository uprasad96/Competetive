#include <bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  for(int t=1;t<=T;t++){
    int L,W,H;
    cin>>L>>W>>H;
    if(L>20||W>20||H>20){
      cout<<"Case "<<t<<": bad\n";
    }
    else{
      cout<<"Case "<<t<<": good\n";
    }
  }
  return 0;
}
