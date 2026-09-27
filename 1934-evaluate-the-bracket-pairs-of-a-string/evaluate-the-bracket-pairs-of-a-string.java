// class Solution {
//     public String evaluate(String s, List<List<String>> list) {
//         HashMap<String,String>map=new HashMap<>();
//         StringBuilder str=new StringBuilder();
//         boolean flag=false;
//         for(int x=0;x<s.length();x++)
//         {
//             if(s.charAt(x)=='(')
//             {
//                 flag=true;
//                 continue;
//             }
//              if(s.charAt(x)==')')
//             {
//                 map.put(str.toString(),"");
//                 str.setLength(0);
//                 flag=false;
//                 continue;
//             }
//             if(flag==true)
//             {
//                 str.append(s.charAt(x));

//             }
           
//         }
//         for(int x=0;x<list.size();x++)
//         {
//             if(map.containsKey(list.get(x).get(0)))
//             {
//                 map.put(list.get(x).get(0),list.get(x).get(1));
//             }
//         }
//         for(String x:map.keySet())
//         {
//             if(map.get(x).equals(""))
//             {
//                  s=  s.replace("("+x+")","?");
//             }
//             else
//             {
//               s=s.replace("("+x+")",map.get(x));
//             }
//         }
//        s= s.replace("(","");
//        s= s.replace(")","");
//         return s;
//     }
// }



class Solution {
    public String evaluate(String s, List<List<String>> list) {
        HashMap<String, String> map = new HashMap<>();

        for(int x = 0; x < list.size(); x++)
        {
            map.put(list.get(x).get(0), list.get(x).get(1));
        }

        StringBuilder ans = new StringBuilder();

        for(int x = 0; x < s.length(); x++)
        {
            if(s.charAt(x) == '(')
            {
                int j = x + 1;

                while(s.charAt(j) != ')')
                {
                    j++;
                }

                String key = s.substring(x + 1, j);

                if(map.containsKey(key))
                {
                    ans.append(map.get(key));
                }
                else
                {
                    ans.append("?");
                }

                x = j;
            }
            else
            {
                ans.append(s.charAt(x));
            }
        }

        return ans.toString();
    }
}