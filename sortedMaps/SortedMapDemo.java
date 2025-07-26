package sortedMaps;

import java.util.*;

public class SortedMapDemo {
	
	public static void main(String[] args) {
		SortedMap<Integer, Integer> mp = new SortedMap<Integer, Integer>() {
			@Override
			public Comparator<? super Integer> comparator() {
				return null;
			}
			
			@Override
			public SortedMap<Integer, Integer> subMap(Integer fromKey, Integer toKey) {
				return null;
			}
			
			@Override
			public SortedMap<Integer, Integer> headMap(Integer toKey) {
				return null;
			}
			
			@Override
			public SortedMap<Integer, Integer> tailMap(Integer fromKey) {
				return null;
			}
			
			@Override
			public Integer firstKey() {
				return 0;
			}
			
			@Override
			public Integer lastKey() {
				return 0;
			}
			
			@Override
			public Set<Integer> keySet() {
				return Set.of();
			}
			
			@Override
			public Collection<Integer> values() {
				return List.of();
			}
			
			@Override
			public Set<Entry<Integer, Integer>> entrySet() {
				return Set.of();
			}
			
			@Override
			public int size() {
				return 0;
			}
			
			@Override
			public boolean isEmpty() {
				return false;
			}
			
			@Override
			public boolean containsKey(Object key) {
				return false;
			}
			
			@Override
			public boolean containsValue(Object value) {
				return false;
			}
			
			@Override
			public Integer get(Object key) {
				return 0;
			}
			
			@Override
			public Integer put(Integer key, Integer value) {
				return 0;
			}
			
			@Override
			public Integer remove(Object key) {
				return 0;
			}
			
			@Override
			public void putAll(Map<? extends Integer, ? extends Integer> m) {
			
			}
			
			@Override
			public void clear() {
			
			}
		};
		
		//if we just type SortedMap<Integer,Integer> mp=new SortedMap<Integer, Integer>(); and all the methods gets override this means its an interface
		
		
		SortedMap<Integer, String> tm = new TreeMap<>();
		//TreeMap uses Red-Black tree for storing
		//TreeMap is the implementation of SortedMap
		
		tm.put(90,"Yash");
		tm.put(88,"Aryan");
		tm.put(45,"Mohit");
		tm.put(68,"Rohit");
		tm.put(99,"Manav");
		
		//sorted according to the values
		System.out.println(tm);
		
		
		
		//Question is if we have Map interface then what is the need of SortedMap?
		//Answer is by using Sorted Map we can have additional funtionalities like
		
		//it will print the values from the map till 50 (only key) from the head #50 is excluded
		System.out.println(tm.headMap(50));
		
		//it will print the values from the map till 50 (only key) from the tail #50 is excluded
		System.out.println(tm.tailMap(50));
		
		
		//it will print the key-value form the map starting from the 65 and till 90 #90 is excluded while 68 is included
		System.out.println(tm.subMap(68,90));
		
		
		//they will print first and last key
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		
		
		//Another Question is what is Navigable Map?
		
		//if we see inside TreeMap we observe it implements navigable map and navigable map implements sortedmap
		
		//now the question is what is the use of navigable map ?
		
		//answer :- it helps us to navigate and gives us additional functionalities like lowerEntry, floorEntry, ceilingEntry, and higherEntry
	}
}
