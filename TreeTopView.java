import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    
	public static void topView(Node root) {
        class QueueObj { 
            Node node; 
            int hd; 
  
            QueueObj(Node node, int hd) { 
                this.node = node; 
                this.hd = hd; 
            } 
        } 

        Queue<QueueObj> q = new LinkedList<QueueObj>(); 
        Map<Integer, Node> topViewMap = new TreeMap<Integer, Node>(); 
        if (root == null)  
            return; 
        else 
            q.add(new QueueObj(root, 0)); 
        
        while (!q.isEmpty()) { 
            QueueObj tmpNode = q.poll(); 
            if (!topViewMap.containsKey(tmpNode.hd)) 
                topViewMap.put(tmpNode.hd, tmpNode.node); 
            
  
            if (tmpNode.node.left != null)  
                q.add(new QueueObj(tmpNode.node.left, tmpNode.hd - 1)); 
             
            if (tmpNode.node.right != null) 
                q.add(new QueueObj(tmpNode.node.right, tmpNode.hd + 1)); 
            
  
        } 
        for (Map.Entry<Integer, Node> entry : topViewMap.entrySet())  
            System.out.print(entry.getValue().data+" "); 
        
      
    }

	public static Node insert(Node root, int data) {
