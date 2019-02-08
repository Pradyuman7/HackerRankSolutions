#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

long long int rec(long long int n){
    if(n == 1)
        return 1;
    if(n%2 == 0)
        return 10*binar(n/2);
    else
        return 10*binar(n/2)+1;
}

int main() {
    int t;
    cin>>t;
    while(t--){
        long long int n,a=1,b=9;
        cin>>n;
        while(b%n != 0){
            a++;
            b = rec(a);
            b *= 9;
        }
        cout<<b<<endl;
    }
    return 0;
}
