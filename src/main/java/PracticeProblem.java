import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class PracticeProblem {

	public static void main(String args[]) {
		//q1
		ArrayList<String> list = new ArrayList<>();
		list.add("Cat");
		list.add("Dog");
		list.add("Bird");
		list.add("Pig");
		list.add("Rabbit");
		list.add("Mouse");
		swap(list, 2, 4);

		//q2
		System.out.println(createArrayList(new double[]{1.1, 2.2, 3.3, 4.4, 5.5}));

		//q3
		System.out.println(combineParallelArrays(new String[]{"Amy", "Bob", "Candy"}, new int[]{22, 27, 29}));

		//q4
		HashMap<String, Integer> people = new HashMap<>();
		people.put("Alex", 30);
		people.put("John", 36);
		people.put("Katherine", 26);
		increaseAge(people, "Bob");
	}


	//q1
	public static void swap(ArrayList<String> list, int num1, int num2) {
		String temp = list.get(num1);
		list.set(num1, list.get(num2));
		list.set(num2, temp);
		System.out.println(list);
	}

	//q2
	public static ArrayList<Double> createArrayList(double[] arr) {
		ArrayList<Double> list2 = new ArrayList<>();
		for (int a = 0; a < arr.length; a++) {
			list2.add(arr[a]);
		}
		return list2;
	}

	//q3
	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int b = 0; b < names.length; b++) {
			map.put(names[b], ages[b]);
		}
		return map;
	}


	//q4
	public static HashMap<String, Integer> increaseAge(HashMap<String, Integer> people, String name) {
		people.put(name, people.get(name) + 1);
		System.out.println(people);
		return people;
	}

}
