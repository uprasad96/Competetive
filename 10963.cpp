#include <bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  getchar();
  while(T--){
    int col;
    cin>>col;
    bool slide = true;
    int top,bot;
    cin>>top>>bot;
    int diff=0;
    if(col>=1){
      diff= abs(top-bot);
      col--;
    }
    while(col--){
      cin>>top>>bot;
      if(abs(top-bot)!=diff){
        slide=false;
      }
    }
    if(slide){
      cout<<"yes\n";
      if(T!=0){
        cout<<"\n";
      }
    }
    else{
      cout<<"no\n";
      if(T!=0){
        cout<<"\n";
      }
    }
    getchar();
  }
}
