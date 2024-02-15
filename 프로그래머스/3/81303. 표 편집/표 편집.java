import java.util.*;
class Solution {
   static class Node{
		int index;
		Node prev, next;
		boolean removed = false;
		
		public Node(int index) {
			this.index = index;
		}
		
		public Node delete() {
			this.removed = true;
			if(prev != null) prev.next = this.next;
			if(next != null) next.prev = this.prev;
			return next != null? next : prev;
		}
		
		public void restore() {
			this.removed = false;
			if(prev != null) prev.next = this;
			if(next != null) next.prev = this;
		}
	}
	
	public static String solution(int n, int k, String[] cmd) {
		
		Node[] nodes = new Node[n];
		Stack<Node> deletedNodes = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			nodes[i] = new Node(i);
		}
		
		for(int i = 1; i < n; i++) {
			nodes[i - 1].next = nodes[i];
			nodes[i].prev = nodes[i - 1];
		}
		
		Node currnetIndex = nodes[k];
		
		for(String command : cmd) {
			char shortcutKey = command.charAt(0);
			int move = 0;
			
			if(command.length() > 1) {
				move = Integer.parseInt(command.split(" ")[1]);
			}
			
			switch(shortcutKey) {
			case 'U' :
				while(move-- > 0) currnetIndex = currnetIndex.prev;
				break;
			case 'D':
				while(move-- > 0)currnetIndex = currnetIndex.next;
				break;
			case 'C':
				deletedNodes.push(currnetIndex);
				currnetIndex = currnetIndex.delete();
				break;
			case 'Z':
				deletedNodes.pop().restore();
				break;
			}
		}
		StringBuilder sb = new StringBuilder("O".repeat(n));
		while(!deletedNodes.isEmpty()) {
			Node node = deletedNodes.pop();
			if(node.removed) {
				sb.setCharAt(node.index, 'X');
			}
		}
        
        return sb.toString();
    }
}