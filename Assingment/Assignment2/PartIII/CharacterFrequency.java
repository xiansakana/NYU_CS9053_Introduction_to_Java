import java.util.HashMap;

public class CharacterFrequency {

	public static char charFrequency(String s) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char highestFreqChar = '\0';
        int highestFreq = 0;

        for (char c : s.toCharArray()) {
        	if(!charCountMap.containsKey(c)) {
        		charCountMap.put(c, 1);
        	}else {
        		charCountMap.put(c, charCountMap.get(c) + 1);
        	}
            if (charCountMap.get(c) > highestFreq) {
                highestFreq = charCountMap.get(c);
                highestFreqChar = c;
            }
        }
		return highestFreqChar;
	}
	
	public static String randomStringGenerator(int chars) {
		char[] charArray = new char[chars];
		for (int i=0;i<charArray.length;i++) {
			char c = (char)((int)(Math.random()*26) + 'a');
			charArray[i] = c;
		}
		return new String(charArray);
	}
	
	public static void main(String[] args) {
		String s = randomStringGenerator(15);
//		String s = "abcdeapapqarr";
		System.out.println(s);
		char result = charFrequency(s);
		System.out.println(result);
	}
}
