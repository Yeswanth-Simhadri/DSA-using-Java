package Greedy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class JobSequence {
    public static class Job {
        int id;
        int deadline;
        int profit;
        public Job(int id,int deadline,int profit){
            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }
        
    }
    public static void main(String[] args) {
        int[][] arr={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            jobs.add(new Job(i, arr[i][0], arr[i][1]));
        }
        int time=0;
        Collections.sort(jobs,(o1,o2)->o2.profit-o1.profit);

        ArrayList<Integer> seq=new ArrayList<>();
        for(int i=0;i<jobs.size();i++){
            if(jobs.get(i).deadline>time){
                seq.add(jobs.get(i).id);
                time++;
            }
        }
        System.out.println(seq+"and "+seq.size());
    }
}
