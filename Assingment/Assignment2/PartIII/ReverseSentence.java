
public class ReverseSentence {

	public static String reverseSentence(String sentence) {
		String[] words = sentence.split(" ");
        for(int i = 0, j = words.length - 1; i < j; i++, j--) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }
        
        words[0] = Character.toUpperCase(words[0].charAt(0)) + words[0].substring(1);
        words[words.length - 1] = Character.toLowerCase(words[words.length - 1].charAt(0)) + words[words.length - 1].substring(1);
        
		return String.join(" ", words);
	}
	
	public static void main(String[] args) {
		String result = reverseSentence("The quick brown fox jumps over the lazy dog");
		System.out.print(result);
	}

}
