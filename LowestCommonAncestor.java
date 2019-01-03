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
	public static Node lca(Node root, int v1, int v2) {
        Node temp = root; 
    
        while (true) {
            if (temp.data > v1 && temp.data > v2) {
            temp = temp.left;
            } 
            else if (temp.data < v1 && temp.data < v2) {
            temp = temp.right;
            } 
            else {
            return temp;
            }
        }
          
    }
    
    public static Node parent(Node currentRoot, Node p) {        
        if (currentRoot == null)
            return null;
        
        else{
            
            if(currentRoot.left == p || currentRoot.right == p)
                return currentRoot;
            
            else {
                
                if (currentRoot.data < p.data) 
                    return parent(currentRoot.right, p);
                
                else 
                    return parent(currentRoot.left, p);
                
            }
        }
    }  

    public static Node inOrderSearch(Node node, int v1){

        if(node.left != null)
            return inOrderSearch(node.left,v1);

        if(node.data == v1)
            return node;

        if(node.right != null)
            return inOrderSearch(node.right,v1);        

        return node;
    }

	public static Node insert(Node root, int data) {
