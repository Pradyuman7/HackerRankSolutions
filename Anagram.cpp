#include <bits/stdc++.h>

using namespace std;

// Complete the anagram function below.
int anagram(string s) {
      vector<int> count(26,0);
      
      if(s.length()%2==0){
        
        for(int i=0;i<s.size()/2;i++){
            count[s[i]-'a']++;
        }
    
        for(int i=s.size()/2;i<s.size();i++){
            count[s[i]-'a']--;
        }
        
        int sum = 0;
        
        for(int i=0;i<26;i++){
            sum += abs(count[i]);
        }
        
        return sum/2;
        
      }
    
      else 
          return -1;   

}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int q;
    cin >> q;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    for (int q_itr = 0; q_itr < q; q_itr++) {
        string s;
        getline(cin, s);

        int result = anagram(s);

        fout << result << "\n";
    }

    fout.close();

    return 0;
}
