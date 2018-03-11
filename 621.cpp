#include <bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  while(T--){
    string str;
    cin>>str;
    int L=str.length();
    if(str=="1"||str=="4"||str=="78"){
      cout<<"+\n";
    }
    else if(str[L-2]=='3'&& str[L-1]=='5'){
      cout<<"-\n";
    }
    else if(str[0]=='9' && str[L-1]=='4'){
      cout<<"*\n";
    }
    else {
      cout<<"?\n";
    }
  }
}
