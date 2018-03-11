#include <iostream>
#include <set>
#include <iterator>
#include <cstdio>
#include <map>
using namespace std;
int main(){
	int T;
	cin>>T;
	int foo = getchar();
	for(int t=0;t<T;t++){
		map <int, int> Map;
		int ch = getchar();
		while(ch!= '\n'){
			int num = ch-'0';
			if(Map.find(num)==Map.end()){
				Map.insert(pair <int, int> (num,0));
			}
			else{
				Map.erase(num);
				Map.insert(pair <int, int> (num,1));
			}
			ch = getchar();
		}
		map <int, int> :: iterator itr;
		int Arr[Map.size()];
		int i=0;
		for(itr = Map.begin(); itr!=Map.end(); itr++){
			Arr[i]= itr->first;
			i++;
		}
		set <int, greater <int> > Q;
		for(int i=0;i<Map.size();i++){
			for(int j=0;j<Map.size();j++){
				int num = 10*Arr[i] + Arr[j];
				if(num>=65 && num<=90 && i!=j){
					Q.insert(num);
				}
			}
		}

		for(itr = Map.begin(); itr !=Map.end(); itr++){
			int first = itr->first;
			if(itr->second==1 && first >=6 && first <=8){
				int num = 10*first +first;
				Q.insert(num);
			}
		}

		char Res[Q.size()];
		int k=0;
		set <int, greater<int> > :: iterator itr2;
		for(itr2 = Q.begin(); itr2!=Q.end(); itr2++){
			char c = *itr2;
			Res[k] = c;
			k++;
		}
		for(int i=Q.size()-1; i>=0; i--){
			cout<<Res[i];
		}
		cout<<"\n";
	}
}
