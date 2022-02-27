package Jan27.Infosys;

import java.util.*;


public class Question3
{
	public static void main(String[] Args)
	{
//	int n =2;
	Integer pt[]= {8,10};
	Integer tt[]={2,2,3,1,8,7,4,5};

//	Arrays.sort(tt, Collections.reverseOrder());
//	System.out.println(Arrays.toString(tt));
	ArrayList<Integer> p = new ArrayList<>();
	Collections.addAll(p, pt);
	ArrayList<Integer> t = new ArrayList<>();
	Collections.addAll(t, tt);
	System.out.println(processorTime(p,t));
	}
	
	
public static int processorTime(List<Integer> processorTime, List<Integer> taskTime)
{
	Collections.sort(processorTime);
	Collections.sort(taskTime,Collections.reverseOrder());
	int [][] time=new int[processorTime.size()][4];
	int count=0, res=0;
	for(int i=0;i<processorTime.size();i++)
	{
		for(int j=0;j<4;j++)
		{
			time[i][j]=processorTime.get(i)+taskTime.get(count);
			count++;
			res=Math.max(res,time[i][j]);
		}
	}
	return res;	
}

}