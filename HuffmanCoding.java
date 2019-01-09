import java.util.*;
 
abstract class Node implements Comparable<Node> {
    
  	public  int frequency; // the frequency of this tree
    public  char data;
    public  Node left, right; 
    public Node(int freq) { 
    	frequency = freq;
   	}
 
    // compares on the frequency
    public int compareTo(Node tree) {
        return frequency - tree.frequency;
    }
  
}
 
class HuffmanLeaf extends Node {
    
    public HuffmanLeaf(int freq, char val) {
        super(freq);
        data = val;
    }
  
}
 
class HuffmanNode extends Node {
    
    public HuffmanNode(Node l, Node r) {
        super(l.frequency + r.frequency);
        left = l;
        right = r;
    }

}


class Decoding {

/*  
	class Node
		public  int frequency; // the frequency of this tree
    	public  char data;
    	public  Node left, right;
    
*/ 

    void decode(String s, Node root) {
        StringBuilder result = new StringBuilder();
        Node curr = root;
        for (char ch : s.toCharArray()) {
            curr = ch == '0' ? curr.left : curr.right;
            if (curr.data != '\0') {
                result.append(curr.data);
                curr = root;
            } 
        }
        System.out.println(result);
    }

