package Arrays.MergingMeeting;

import java.util.*;

public class Driver {
    public List<Meeting> merged(List<Meeting> original){
        Collections.sort(original, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                return o1.getStartTime() - o2.getStartTime();
            }
        });

        ArrayList<Meeting> results = new ArrayList<>();

        for(int i = 0 ; i < original.size(); i++){
            Meeting current = results.get(i);
            if(i == 0){
                results.add(current);
            }
            else{
                Meeting end = results.get(results.size() - 1);
                if(current.getStartTime() <= end.getEndTime()){
                    end.setEndTime(Math.max(current.getEndTime(), end.getEndTime()));
                }
                else{
                    results.add(current);
                }
            }
        }
        return results;
    }
    public static void main(String[] args) {
    }
}
