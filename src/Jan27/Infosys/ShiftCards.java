package Jan27.Infosys;

import java.util.*;

public class ShiftCards {

	public static void main(String[] args) { 
		
		String tools[] = {"black", "grey", "brown", "red", "pink"}; 
		ArrayList<String> l = new ArrayList<>(); 
		Collections.addAll(l, tools); 
		int start = 3; 
		String target = "black"; 
		System.out.println(shiftCards(l,start,target));
	}
 
	public static int shiftCards(List<String> cards, int startIndex, String target)
	{
		int len;
//		if(startIndex==cards.indexOf(target))
//		{
//			return 0;
//		}
			if(startIndex>=cards.indexOf(target))
			{
				len=startIndex-cards.indexOf(target);
			}
			else
			{
				len=cards.indexOf(target)-startIndex;
			}

			return (len < cards.size()-len)? len:cards.size()-len;
//			if(len < cards.size()-len)
//			{
//				return len;
//			}
//			else
//			{
//				return cards.size()-len;
//			}
		
	
	}
 }
 


