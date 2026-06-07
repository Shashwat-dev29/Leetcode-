import java.util.*;

class Solution {
    List<String> so = new ArrayList<>();

    public List<String> generateValidStrings(int n, int k) {
        s(0, n, k, "", -1, 0);
        return so;
    }

    public void s(int x, int n, int k, String si, int prev, int cost) {

        if (cost > k) {
            return;
        }

        if (x == n) {
            so.add(si);
            return;
        }

        
        s(x + 1, n, k, si + "0", 0, cost);

        
        if (prev != 1) {
            s(x + 1, n, k, si + "1", 1, cost + x);
        }
    }
}
