#include <bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  while(T--){
    string fruits;
    cin>>fruits;
    int x,y;
    cin>>x>>y;
    int m = 0;
    int n = 0;
    for(int i=0;i<fruits.length();i++){
      if(fruits[i]=='a'){
        m++;
      }
      else{
        n++;
      }
    }
    if(m>=n){
      int bSize = ceil(m/x) - 1;
      if(bSize==0){
        bSize=1;
      }
      while(m>0||n>0){
        for(int i=0;i<x;i++){
          if(m==0){
            break;
          }
          cout<<"a";
          m--;
        }
        if(n==0 && m>0){
          cout<<"*";
        }
        for(int i=0;i<bSize;i++){
          if(n==0){
            break;
          }
          cout<<"b";
          n--;
        }
        if(m==0 && n>0){
          cout<<"*";
        }
        if(m==0 && n==0){
          cout<<"\n";
          break;
        }
      }
    }
    else{
      int aSize = ceil(n/y) - 1;
      if(aSize==0){
        aSize=1;
      }
      while(m>0||n>0){
        for(int i=0;i<y;i++){
          if(n==0){
            break;
          }
          cout<<"b";
          n--;
        }
        if(m==0 && n>0){
          cout<<"*";
        }
        for(int i=0;i<aSize;i++){
          if(m==0){
            break;
          }
          cout<<"a";
          m--;
        }
        if(n==0&&m!=0){
          cout<<"*";
        }
        if(m==0 && n==0){
          cout<<"\n";
          break;
        }
      }
    }
  }
}
