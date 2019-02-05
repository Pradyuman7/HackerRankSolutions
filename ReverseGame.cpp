#include <bits/stdc++.h>
using  namespace std;

int main()
{
    int t,n;
    cin>>t;
    for(int i=0; i<t; i++){
        cin>>n;
        int num;
        cin>>num;
        if((1+num*2)<n)
            cout<<1+num*2<<endl;
        else 
            cout<<(n-1-num)*2<<endl;
      
    }
    
    return 0;
}
