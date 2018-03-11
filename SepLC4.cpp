# define d 1000000007
# define ULL unsigned long long int
#include <bits/stdc++.h>
using namespace std;

int* execute(int Comds[][3],int start, int end, int size){
  int rv[size];
  for(int i=start;i<=end;i++){
    if(Comds[i][0]==1){
      for(int k=Comds[i][1];k<=Comds[i][2];k++){
        rv[k]++;
      }
    }
    else{
      int *Arr;
      Arr = execute(Comds, Comds[i][1], Comds[i][2],size);
      for (int k = 0; k < size; k++) {
        rv[k] += Arr[k];
      }
    }
  }
  return rv;
}
int main(){
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int T;
  cin>>T;
  for( int t=0;t<T;t++){
    int N,M;
    cin>>N>>M;
    int Arr[N];
    for(int i=0;i<N;i++){
      Arr[i]=0;
    }
    int Comds[M][3];
    for( int i=0;i<M;i++){
      cin>>Comds[i][0];
      cin>>Comds[i][1];
      Comds[i][1]--;
      cin>>Comds[i][2];
      Comds[i][2]--;
    }
    int *result;
    result = execute(Comds,0,M-1,N);
    for( int i=0;i<N;i++){
      cout<<result[i]<<" ";
    }
    cout<<"\n";
  }
}
