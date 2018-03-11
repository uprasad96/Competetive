#include <iostream>
#include <climits>
using namespace std;

int main(){
	int T;
	cin>>T;
	for(int t=0;t<T;t++){
		int N;
		cin>>N;
		int min=INT_MAX;
		int ind=0;
		for(int i=0;i<N;i++){
			int num;
			cin>>num;
			if(num<min){
				min=num;
				ind=i;
			}
		}
		cout<<ind+1<<"\n";
	}
}
