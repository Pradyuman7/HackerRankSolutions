#include <iostream>
#include <cmath>
#include <ios>
#include <iomanip>

using namespace std;

int main(){
  unsigned long l=0, s1=0, s2=0, nquery=0, q=0;
  cin >> l >> s1 >> s2;
  
  double coef = sqrt(2.0)/(s1 > s2 ? s1-s2 : s2-s1);
  
  cin >> nquery;
  cout << fixed << setprecision(6); 
  
  while(cin >> q){
    cout << coef*(l*l==q ? 0 : l*l>q ? l-sqrt(1.0*q) : l+sqrt(1.0*q)) << '\n';
  }
}

