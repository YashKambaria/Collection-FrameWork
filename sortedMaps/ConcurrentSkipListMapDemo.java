package sortedMaps;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
	public static void main(String[] args) {
		/*Skip list is a probabilistic data structure that allows
		for efficient search ,insertion, and deletion operations.
		
		It is similar to a sorted linked list but with
		multiple layers that "skip" over portions of the
		list to provide faster access to elements
		
		
		eg -> 1,2,3,4,5,6,7,8,9
		
		layer 1 ->1,2,3,4,5,6,7,8,9
		layer 2->1...3..5..7..9
		layer 3->1.....5.....9
		
		now the searching starts from layer 3 and goes to upper lvl accordingly hence the time complexity becomes log N
		
		 */
		ConcurrentSkipListMap<String,Integer> map = new ConcurrentSkipListMap<>();
		map.put("Apple", 2);
		
	}
}