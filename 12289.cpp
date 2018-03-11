# include<bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  getchar();
  char one[6] = "one";
  char two[6] = "two";
  char three[6] = "three";
  while (T--) {
    char str[6];
    int i=0;
    char ch = getchar();
    while(ch != '\n'){
      str[i] = ch;
      i++;
      ch = getchar();
    }
    int W1 = 0;
    int W2 = 0;
    int W3 = 0;
    for(int k=0;k<i;k++){
      if(str[k]!=one[k]){
        W1++;
      }
      if(str[k]!=two[k]){
        W2++;
      }
      if(str[k]!=three[k]){
        W3++;
      }
    }
    if(W1<=1){
      cout<<1;
    }
    else if(W2<=1){
      cout<<2;
    }
    else{
      cout<<3;
    }
    cout<<endl;
  }
  return 0;
}
