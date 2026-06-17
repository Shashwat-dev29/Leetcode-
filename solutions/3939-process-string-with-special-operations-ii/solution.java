// class Solution {
//     public char processStr(String s, long k) {
//         StringBuilder sb = new StringBuilder();
//         for(int x=0;x<s.length();x++)
//         {
//             if(s.charAt(x)=='*')
//             {
//                 if(sb.length()>0)
//                 {
//                sb.deleteCharAt(sb.length() - 1);
//                 }
//             }
//              else if(s.charAt(x)=='#')
//             {
//                 sb.append(sb);
//             }
//              else if(s.charAt(x)=='%')
//             {
//                 sb.reverse();
//             }
//             else
//             {
//                   sb.append(s.charAt(x));
//             }
//         }
//         if(k>=sb.length())
//         {
//           return'.';
//         }
//         int ki=(int)k;
//         return sb.charAt(ki);
//     }
// }



class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long[] len = new long[n];

        long curr = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '*') {
                if (curr > 0) curr--;
            }
            else if (ch == '#') {
                curr = Math.min(curr * 2, (long)1e15);
            }
            else if (ch == '%') {
                // reverse does not change length
            }
            else {
                curr++;
            }

            len[i] = curr;
        }

        if (k >= curr) {
            return '.';
        }

        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            long curLen = len[i];
            long prevLen = (i == 0) ? 0 : len[i - 1];

            if (ch == '#') {
                if (prevLen > 0) {
                    if (k >= prevLen) {
                        k -= prevLen;
                    }
                }
            }
            else if (ch == '%') {
                if (curLen > 0) {
                    k = curLen - 1 - k;
                }
            }
            else if (ch == '*') {
                if (prevLen == curLen + 1) {
                    // A character was deleted.
                    // If k points into the remaining part,
                    // it stays unchanged.
                }
            }
            else {
                if (k == curLen - 1) {
                    return ch;
                }
            }
        }

        return '.';
    }
}
