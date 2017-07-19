import java.util.*;

class Decision {
    
    // DetermineDealerAction()
    // Returns what action the dealer should take
    public Action determineDealerAction(ArrayList<Integer> UserHand) {
        if (sumOfArrayList(UserHand) < 17) {
        	return Action.HIT;
    	} else {
    		return Action.STAND;
    	}
    }
    
    // DetermineUserAction()
    // Determine what action the user should take
    // hitAndStandOnly indicates if first or second hand of a split
    public Action determineUserAction(ArrayList<Integer> UserHand, ArrayList<Integer> DealerHand, boolean hitAndStandOnly) {
        return Action.HIT;
    }
    
    private int sumOfArrayList(ArrayList<Integer> in) {
        int total = 0;
        int aces = 0;
        for(int cur : in) {
            total = total + cur;
            if (cur == 1) {
            	aces++;
            }
        }
        while ((total>21) && (aces>0)) {
        	total-=10;
        	aces--;
        }
        return total;
    }
}