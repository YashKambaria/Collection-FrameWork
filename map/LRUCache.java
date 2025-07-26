package map;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
	private int capacity;
	
	public LRUCache(int capacity) {
		super(capacity, 0.75f, true);
		this.capacity = capacity;
	}
	
	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		//here if the size is greater than it will remove the most unused entry
		return size() > capacity;
	}
	
	public static void main(String[] args) {
		LRUCache<String, Integer> studentMap = new LRUCache<>(3);
		studentMap.put("Bob", 99);
		studentMap.put("Alice", 89);
		studentMap.put("Ram", 91);
		//here the capacity is full
		studentMap.put("Bob", 100);
		//but the bob is already there so it will update and it will go below like
		//("Alice", 89)
 		//("Ram", 91)
 		//("Bob", 100)
		studentMap.put("Vipul", 89);
		//hence once the vipul comes alice will be removed
		
		//this helps in caching where we have to store short and finite data
		
		
		System.out.println(studentMap);
	}
}