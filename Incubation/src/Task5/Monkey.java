package Task5;

import java.awt.List;
import java.util.LinkedList;
import java.util.Scanner;

public class Monkey {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalTree=sc.nextInt();

        int maxCost= 0;

        int costTotravelunitDistance=1;

        LinkedList<Integer> heightList = new LinkedList<Integer>(); 

        //taking the height input for n number of trees
        for(int i=1;i<=totalTree;i++) {

            int height=sc.nextInt();

            heightList.add(height);
        }

        for(int i=0;i<heightList.size()-1;i++) {
            
            int tempCost=(heightList.get(i)*
             costTotravelunitDistance)+
             (costTotravelunitDistance*1)+
           (heightList.get(i+1)*costTotravelunitDistance);
           
            maxCost=Math.max(maxCost, tempCost);
        }
        System.out.println(maxCost);
        
    }

}
