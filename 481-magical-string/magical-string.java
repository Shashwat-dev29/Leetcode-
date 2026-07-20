class Solution {
    public int magicalString(int n) {
      int count=0;
      String t=generateMagicString(n);
      for(int x=0;x<n;x++)
      {
        if(t.charAt(x)=='1')
        {
            count++;
        }
      }
      return count;
    }
     public String generateMagicString(int n) {
        if (n <= 0) return "";

        int[] magic = new int[n + 2];
        magic[0] = 1;
        if (n == 1) return "1";

        magic[1] = 2;
        if (n == 2) return "12";

        magic[2] = 2;

        int head = 2;
        int tail = 3;
        int num = 1;

        while (tail < n) {
            for (int i = 0; i < magic[head] && tail < n; i++) {
                magic[tail++] = num;
            }

            num = (num == 1) ? 2 : 1;
            head++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(magic[i]);
        }

        return sb.toString();
    }
}