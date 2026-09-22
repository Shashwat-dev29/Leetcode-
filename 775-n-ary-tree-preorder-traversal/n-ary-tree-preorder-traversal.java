/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer>list=new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root==null)
        {
            return list;
        }
        traverse(root,root.children);
        return list;
    }
    private void traverse(Node root,List<Node>children)
    {
       if(root==null)
       {
        return;
       }
      list.add(root.val);
        for(int x=0;x<children.size();x++)
        {
            
            traverse(children.get(x),children.get(x).children);
        }
       
    }
}