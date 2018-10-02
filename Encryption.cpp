#include <bits/stdc++.h>

using namespace std;

int main() {
    int r,c;
    string s;
    cin>>s;
    int l=s.length();
    r=floor(sqrt(l));
    c=ceil(sqrt(l));
    if((r*c)<l)
        r++;
    for(int i=0;i<c;i++)
    {
        for(int j=i;j<l;j+=c)
        {
            cout<<s[j];
        }
        cout<<" ";
    }
    return 0;
}
