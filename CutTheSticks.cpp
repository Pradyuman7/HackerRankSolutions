#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int arr_i = 0;arr_i < n;arr_i++){
       cin >> arr[arr_i];
    }
    int na=n;
    int no=0;
    cout<<n<<endl;
    sort(arr.begin(),arr.end());
    int c_ele=arr[0];
    while(na>1)
    {
    for(int a=0;a<n;a++)
    {
        while(arr[a]==c_ele)
        {
            no++;
            a++;      //makes complexity O(n*log n)
        }
        na=na-no;
        if(na>=1)
        cout<<na<<endl;
        no=1;
        c_ele=arr[a];
    }
    }
    return 0;
}
