public class main {
	public static void main(String[] args) {
//		Iterable is father of all Collections
//		Iterable<E>
//		│
//		├── // Collection interface extends Iterable
//		└── Collection<E>
//		    │
//		    ├── // List: Ordered collection (allows duplicates, indexed)
//		    ├── List<E>
//		    │   ├── ArrayList<E>       // Resizable array, fast access, not thread-safe
//		    │   ├── LinkedList<E>      // Doubly-linked list, good for insert/delete
//		    │   └── Vector<E>          // Synchronized, legacy (use ArrayList instead)
//		    │       └── Stack<E>       // Legacy LIFO stack (use Deque instead)
//		    │
//		    ├── // Set: No duplicates, no guaranteed order
//		    ├── Set<E>
//		    │   ├── HashSet<E>         // Backed by HashMap, no ordering
//		    │   ├── LinkedHashSet<E>   // Maintains insertion order
//		    │   └── TreeSet<E>         // Sorted set (uses Red-Black Tree), implements NavigableSet
//		    │
//		    ├── // Queue: FIFO collection (used in scheduling, messaging)
//		    ├── Queue<E>
//		    │   ├── LinkedList<E>      // Implements both List and Queue
//		    │   ├── PriorityQueue<E>   // Orders by comparator or natural order
//		    │   └── ArrayDeque<E>      // Resizable array-based Deque (better than Stack/LinkedList)
//		    │
//		    └── // Deque: Double-ended queue (can add/remove from both ends)
//		        └── Deque<E>
//		            ├── LinkedList<E>  // Implements Deque too
//		            └── ArrayDeque<E>  // More efficient than Stack

//			// Note: Map is NOT a subtype of Collection
//					Map<K, V>
//			      ├── HashMap<K, V>             // No order, allows one null key
//			      ├── LinkedHashMap<K, V>       // Maintains insertion order
//			      └── TreeMap<K, V>             // Sorted map (Red-Black Tree), implements NavigableMap
	
	}
}
