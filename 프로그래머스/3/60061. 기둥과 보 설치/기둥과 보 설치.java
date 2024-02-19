import java.util.*;
class Solution {
     static Set<Build> structures = new HashSet<>();
	
	 static class Build{
		int x;
		int y;
		int type; // 0 for column, 1 for beam
	
		
		public Build(int x, int y, int type) {
			this.x = x;
			this.y = y;
			this.type = type;
		}
		
		
		@Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Build build = (Build) o;
            return x == build.x && y == build.y && type == build.type;
        }

        @Override
        public int hashCode() {
            return (31 * x + y) * 31 + type;
        }
	}
	 
	
	 public static boolean existsColumn(int x, int y) {
	     return structures.contains(new Build(x, y, 0));
	 }

	 public static boolean existsBeam(int x, int y) {
	     return structures.contains(new Build(x, y, 1));
	 }

	 public static boolean canPlaceBuild(Build build) {
	     if (build.type == 0) { 
	        
	         if (build.y == 0) return true;
	       
	         if (existsBeam(build.x - 1, build.y) || existsBeam(build.x, build.y)) return true;
	        
	         if (existsColumn(build.x, build.y - 1)) return true;
	     } else { 
	      
	         if (existsColumn(build.x, build.y - 1) || existsColumn(build.x + 1, build.y - 1)) return true;
	         
	         if (existsBeam(build.x - 1, build.y) && existsBeam(build.x + 1, build.y)) return true;
	     }
	     return false;
	 }

	 public static boolean canRemoveBuild(Build build) {
	    
	     structures.remove(build);
	     
	    
	     for (Build otherBuild : structures) {
	         if (!canPlaceBuild(otherBuild)) {
	            
	             structures.add(build);
	             return false;
	         }
	     }
	     
	     return true;
	 }
	
	public static int[][] solution(int n, int[][] build_frame) {
       
        for(int[] frame : build_frame) {
        	Build build = new Build(frame[0], frame[1], frame[2]);
        	
        	if(frame[3] == 1) { 
        		if(canPlaceBuild(build)) {
        			structures.add(build);
        		}
        	}else { 
        		if(canRemoveBuild(build)) {
        			structures.remove(build);
        		}
        	}
        }
        
        int[][] answer = new int[structures.size()][3];
        int index = 0;
        for (Build build : structures) {
            answer[index][0] = build.x;
            answer[index][1] = build.y;
            answer[index][2] = build.type;
            index++;
        }
        
        Arrays.sort(answer, (a, b) -> {
            if (a[0] != b[0])
                return Integer.compare(a[0], b[0]);
            else if (a[1] != b[1])
                return Integer.compare(a[1], b[1]);
            else
                return Integer.compare(a[2], b[2]);
        });
        
        return answer;
    }
}