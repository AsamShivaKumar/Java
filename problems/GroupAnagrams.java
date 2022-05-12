package problems;

import java.util.*;

public class GroupAnagrams {

	public static void main(String[] args) {
		String str[] = {"ate","eat","cat","top","pot","tac","ha","act"};
		System.out.println(group(str));
	}
	public static List<List<String>> group(String[] strs){
		Map<String,LinkedList<String>> map = new HashMap<>();
		
		for(String s: strs) {
			char chara[] = s.toCharArray();
			Arrays.sort(chara);
			String co = new String(chara);
			
			if(!map.containsKey(co)) {
				map.put(co, new LinkedList<>());
			}
			map.get(co).add(s);
			}	
		
		return new LinkedList<>(map.values());
	}

}
