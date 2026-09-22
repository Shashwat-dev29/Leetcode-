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
    int max=0;
    public int maxDepth(Node root) {
        if(root==null)
        {
            return 0;
        }
        traverse(root,1,root.children);
        return max;
    }
    private void traverse(Node root,int level,List<Node>children)
    {
        if(root==null)
        {
            return;
        }
        if(level>max)
        {
            max=level;
        }
        if(!children.isEmpty())
        {
            level++;
        for(int x=0;x<children.size();x++)
        {
        traverse(children.get(x),level,children.get(x).children);
        }
        }
        // traverse(root.right,level+1);
    }
}