#include <iostream>
using namespace std;

void swap (int* Arr, int i, int j){
	int temp=Arr[i];
	Arr[i]=Arr[j];
	Arr[j]=temp;
}
int main(){
	int T;
	cin>>T;
	for(int t=0;t<T;t++){
		int N;
		cin>>N;
		int Arr[N];
		for(int i=0;i<N;i++){
			Arr[i]=i+1;
		}
		for(int i=0;i<N;i+=2){
			if(i==N-1){
				swap(Arr,i,i-1);
			}
			else{
				swap(Arr,i,i+1);
			}
		}
		for(int i=0;i<N;i++){
			cout<<Arr[i]<<" ";
		}
		cout<<"\n";
	}
}
