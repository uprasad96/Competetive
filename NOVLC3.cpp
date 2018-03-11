#include<iostream>
using namespace std;
int main(){
  int T;
  cin>>T;
  while(T--){
    int N,P;
    cin>>N>>P;
    if(P==1 || P==2){
      cout<<"impossible\n";
      continue;
    }
    else{
      for(int i=1;i<=N;i++){
        if(i%P == 0 ||(i-1)%P==0){
          cout<<"a";
        }
        else{
          cout<<"b";
        }
      }
      cout<<"\n";
    }
  }
}
