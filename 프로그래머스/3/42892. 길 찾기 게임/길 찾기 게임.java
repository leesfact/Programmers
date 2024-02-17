import java.util.*;
class Node implements Comparable<Node>{
	
	int x, y, id;
    Node left, right;

    Node(int x, int y, int id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

	@Override
	public int compareTo(Node other) {
		if(this.y == other.y) return this.x - other.x;
		return other.y - this.y;
	}
	
}


class Solution {
    static Node root;
	static List<Integer> preOrderList = new ArrayList<>();
	static List<Integer> postOrderList = new ArrayList<>();
	
	public static void insert(Node parent, Node child) {
		if(child.x < parent.x) {
			if(parent.left == null) {
				parent.left = child;
			}else {
				insert(parent.left, child);
			}
		}else {
			if(parent.right == null) {
				parent.right = child;
			}else {
				insert(parent.right, child);
			}
		}
	}
	
	public static void preOrder(Node node) {
		if(node == null) return;
		preOrderList.add(node.id);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public static void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        postOrderList.add(node.id);
    }
	
	public static int[][] solution(int[][] nodeinfo) {
        
		List<Node> nodes = new ArrayList<>();
		for(int i= 0 ; i < nodeinfo.length; i++) {
			nodes.add(new Node(nodeinfo[i][0], nodeinfo[i][1], i+1));
		}
		
		Collections.sort(nodes);
		
		root = nodes.get(0);
		for(int i = 1; i < nodes.size(); i++) {
			insert(root, nodes.get(i));
		}
		
		preOrder(root);
        postOrder(root);

        int[][] answer = new int[2][nodeinfo.length];
        for (int i = 0; i < nodeinfo.length; i++) {
            answer[0][i] = preOrderList.get(i);
            answer[1][i] = postOrderList.get(i);
        }
        
        return answer;
    }
}