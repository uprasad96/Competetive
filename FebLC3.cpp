#include <iostream>
using namespace std;
#define RLL unsigned long long int
int main(){
  int t;
  cin>>t;
  while(t--){
    int N;
    cin>>N;
    RLL MTunn = 0;
    for(int i=0;i<N;i++){
      RLL Tunn;
      cin>>Tunn;
      if(Tunn>MTunn){
        MTunn = Tunn;
      }
    }
    int C;
    cin>>C;
    RLL D, S, delay;
    cin>>D;
    cin>>S;
    delay = MTunn*(C-1);
    cout<<delay<<"\n";
  }
}
