#include <bits/stdc++.h>

using namespace std;

// Complete the solve function below.
double area(double a,double b){
    return (sqrt(a*a+b*b));
}
int main() {
    double min_x,max_x,min_y,max_y;
    min_x=min_y=INT_MAX;
    max_x=max_y=INT_MIN;
    
    int t;
    cin>>t;
    
    while(t--){
         double x,y;
         cin>>x>>y;
         max_y=max(y,max_y);
         min_y=min(y,min_y)
         min_x=min(x,min_x);
         max_x=max(x,max_x);
   }
 
         
         double max_value=DBL_MIN;
         max_value=max(abs(max_x-min_x),abs(min_y-max_y));
         max_value=max(max_value,area(max_x,max_y));
         max_value=max(max_value,area(max_x,min_y));
         max_value=max(max_value,area(min_x,min_y));
         max_value=max(max_value,area(min_x,max_y));


         cout<<setprecision(20)<<max_value;
     
}
