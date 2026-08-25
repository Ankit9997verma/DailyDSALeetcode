class Solution {
    unordered_map<string, int> memo;

    bool hasDuplicate(string temp, string s1) {
        int arr[26] = {0};

        for (int i = 0; i < temp.length(); i++) {
            arr[temp[i] - 'a']++;
        }

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1[i];

            arr[ch - 'a']++;

            if (arr[ch - 'a'] > 1) {
                return true;
            }
        }

        return false;
    }

    int solve(int i, vector<string>& arr, string temp, int n) {

        if (i >= n) {
            return temp.length();
        }

        string key = to_string(i) + "#" + temp;

        if (memo.find(key) != memo.end()) {
            return memo[key];
        }

        int include = 0;
        int exclude = 0;

        if (hasDuplicate(temp, arr[i])) {

            exclude = solve(i + 1, arr, temp, n);

        } else {

            exclude = solve(i + 1, arr, temp, n);


            include = solve(
                i + 1,
                arr,
                temp + arr[i],
                n
            );
        }

        int ans = max(include, exclude);

        memo[key] = ans;

        return ans;
    }

public:
    int maxLength(vector<string>& arr) {

        memo.clear();

        return solve(0, arr, "", arr.size());
    }
};