#include<bits/stdc++.h>
using namespace std;
int main(){
    string str;
    cin>>str;
    int cnt=1;
    while(str!="*"){
      if(str=="Hajj"){
        cout<<"Case "<<cnt<<": Hajj-e-Akbar\n";
      }
      else if(str=="Umrah"){
        cout<<"Case "<<cnt<<": Hajj-e-Asghar\n";
      }
      cnt++;
      cin>>str;
    }
}
