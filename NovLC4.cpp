#include<bits/stdc++.h>
using namespace std;
int main(){
  int T;
  cin>>T;
  while(T--){
    int N, A;
    cin>>N>>A;
    int L;
    if(A==1){
      L=N;
      cout<<L<<" ";
      for(int i=0;i<N;i++){
        cout<<"a";
      }
      cout<<"\n";
    }
    else if(A==2){
      if(N==1){
        cout<<1<<" ";
        cout<<"a";
      }
      if(N==2){
        cout<<1<<" ";
        cout<<"ab";
      }
      if(N==3){
        cout<<2<<" ";
        cout<<"abb";
      }
      if(N>=4 && N<=8){
        cout<<3<<" ";
        string str = "aaababbb";
        int k = 0;
        for(int i=0;i<N;i++){
          cout << str[k];
          k++;
        }
      }
      if(N>=9){
        cout<<4<<" ";
        string str = "aababb";
        int k = 0;
        for(int i=0;i<N;i++){
          cout << str[k];
          k++;
          if(k==6){
            k=0;
          }
        }
      }
      cout<<"\n";
    }
    else{
      /*A>2*/
      L=1;
      cout<<L<<" ";
      int cnt = 'a';
      int k = 0;
      for(int i=0;i<N;i++){
        cout << char(cnt);
        cnt++;
        k++;
        if(k==A){
          k=0;
          cnt = 'a';
        }
      }
      cout<<"\n";
    }
  }
}
