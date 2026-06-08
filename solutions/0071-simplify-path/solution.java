class Solution {
    public String simplifyPath(String path) {

        String[] words = path.split("/");
        ArrayList<String> list = new ArrayList<>();

        int x = 0;

        while (x < words.length) {

            if (words[x].equals("") || words[x].equals(".")) {
                x++;
            }
            else if (words[x].equals("..")) {
                if (!list.isEmpty()) {
                    list.remove(list.size() - 1);
                }
                x++;
            }
            else {
                list.add(words[x]);
                x++;
            }
        }

        String s = "";

        for (String str : list) {
            s += "/" + str;
        }

        return s.equals("") ? "/" : s;
    }
}
