#include<bits/stdc++.h>
using namespace std;
int main(){
  while(true){
    char ch = getchar();
    char ch2 = getchar();
    int count = 0;
    if(ch=='E'){
      break;
    }
    int num = ch-'0';
    if(num==0 && ch2 == '\n'){
      cout<<2<<"\n";
    }
    else if(num==1 && ch2 == '\n'){
      cout<<1<<"\n";
    }
    else if(num>=2 && num <=9 && ch2 == '\n'){
      cout<<2<<"\n";
    }
    else{
      count = 2;
      bool flag =false;
      while(getchar()!='\n'){
        count++;
        if(count>=10){
          flag=true;
        }
      }
      if(!flag){
        cout<<3<<"\n";
      }
      else{
        cout<<4<<"\n";
      }
    }
  }
}
