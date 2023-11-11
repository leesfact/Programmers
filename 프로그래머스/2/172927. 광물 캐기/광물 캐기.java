import java.util.*;
class Solution {
    static final int[][] fatigueCosts = {
			{1, 1, 1},
			{5, 1, 1},
			{25, 5, 1}
	};
	
	static class MineralGroup {
        int[] groupMinerals;

        public MineralGroup(int[] groupMinerals) {
            this.groupMinerals = groupMinerals;
        }
        
        public int fatigueWithPickaxe(int[][] fatigueCosts, int pickaxe) {
            int fatigue = 0;
            for (int i = 0; i < groupMinerals.length; i++) {
                fatigue += groupMinerals[i] * fatigueCosts[pickaxe][i];
            }
            return fatigue;
        }
	}
    
	

	public static int solution(int[] picks, String[] minerals) {
		List<MineralGroup> groups = new ArrayList<>();
        int totalFatigue = 0;
        
        int totalPicks = Arrays.stream(picks).sum();
        int mineralsToProcess = Math.min(minerals.length, totalPicks * 5);
        
        
        for (int i = 0; i < mineralsToProcess; i += 5) {
            int[] groupMinerals = new int[3];
            int groupEnd = Math.min(i + 5, minerals.length); 
            for (int j = i; j < groupEnd; j++) {
                groupMinerals[getMineralIndex(minerals[j])]++;
            }
            groups.add(new MineralGroup(groupMinerals));
        }
        
      
        groups.sort((g1, g2) -> Integer.compare(
            g2.fatigueWithPickaxe(fatigueCosts, 2), 
            g1.fatigueWithPickaxe(fatigueCosts, 2)
        ));
        
       
        for (MineralGroup group : groups) {
        	
        	if (totalPicks == 0) {
                break;
            }
        	
            int bestPickaxe = selectBestPickaxeForGroup(picks, group.groupMinerals);
            
            if (bestPickaxe == -1) {
                break;
            }
            
            for (int i = 0; i < group.groupMinerals.length; i++) {
                totalFatigue += group.groupMinerals[i] * fatigueCosts[bestPickaxe][i];
            }
            picks[bestPickaxe]--;
        }
        System.out.println(totalFatigue);
        return totalFatigue;
    }

    private static int selectBestPickaxeForGroup(int[] remainingPicks, int[] groupMinerals) {
        int minGroupFatigue = Integer.MAX_VALUE;
        int bestPickaxe = -1;

        
        for (int i = 0; i < remainingPicks.length; i++) {
            if (remainingPicks[i] > 0) {
                int fatigue = 0;
                for (int j = 0; j < 3; j++) {
                    fatigue += groupMinerals[j] * fatigueCosts[i][j];
                }
                if (fatigue < minGroupFatigue) {
                    minGroupFatigue = fatigue;
                    bestPickaxe = i;
                }
            }
        }

        return bestPickaxe;
    }

    private static int getMineralIndex(String mineral) {
        switch (mineral) {
            case "diamond": return 0;
            case "iron":    return 1;
            case "stone":   return 2;
            default:        return -1;
        }
    }
}