import java.util.HashMap;
import java.util.ArrayList;

class Notes {
	public static void main(String[] args) {

		//AutoBoxing and Unboxing (Using Wrapper Classes)

		//change our primitive data types into non-primitive data types

		// Integer;
		// Boolean;
		// Character;
		// Double;

		//Creating ArrayLists (Uses Wrapper Classes not Primitive types)

		ArrayList<Integer> arrL = new ArrayList<Integer>(); //create an empty arraylist

		//uses methods to access ArrayList, you can't use array notation

		//add(value)

		arrL.add(3);

		//get(index)

		System.out.println(arrL.get(0));

		//clear

		arrL.clear();

		//output an arrayList

		System.out.println(arrL);

		//size()

		System.out.println(arrL.size());

		//set(index, value)

		arrL.add(5);
		
		System.out.println(arrL);
		arrL.set(0, 3);

		System.out.println(arrL);

		//remove

		int a = 0; //index
		Integer b = 3; //value

		arrL.add(2);
		System.out.println(arrL);

		arrL.remove(0); //defaults to int not Integer
		// arrL.remove(b);
		System.out.println(arrL);
		
		//HashMaps

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		//empty hashmap

		//first data type -> key
		//second data type -> value

		//keys must be unique 
		//value do not need to be unique

		//add to a hashmap

		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 1);

		//Getting a Value from a HashMap -> access by key

		System.out.println(map.get("c"));

		//remove a key

		map.remove("d");
		System.out.println(map);

		//map.clear()

		//size()

		//hashmaps vs parallel arrays/arraylists

		//HashMap -> Order does NOT matter, Have two associated value, Hashmaps are faster
		//Parallel Array/ArrayList -> If you want repeated keys, order matters, more than 2 associated
	}
}
