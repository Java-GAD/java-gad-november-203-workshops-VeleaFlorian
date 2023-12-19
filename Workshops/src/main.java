import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        System.out.println(multiply(-2,-3) );
    }


    public static void anagram(String s1, String s2) {
//        HashMap<Character, Integer> isAnagram = new HashMap<>();
//        for(int i = 0; i < s1.length(); i++){
//            Character c = s1.charAt(i);
//            if(isAnagram.containsKey(c)) {
//                isAnagram.put(c, isAnagram.get(c) + 1);
//            } else {
//                isAnagram.put(c, 1);
//            }
//        }
//        for(int i = 0; i < s2.length(); i++) {
//            Character c = s2.charAt(i);
//            if(isAnagram.containsKey(c)) {
//                isAnagram.put(c, isAnagram.get(c) - 1);
//                if(isAnagram.get(c))
//            }
//        }
        int[] vector = new int[26];
        for(int i = 0; i < s1.length(); i++) {
            vector[s1.charAt(i) - 'a'] += 1;
        }
        for(int i = 0; i < s2.length(); i++) {
            vector[s2.charAt(i) - 'a'] -= 1;
            if(vector[s2.charAt(i) - 'a'] <= 0) {
            }
        }
    }

    public static long multiply(int a, int b) {
        if(a == 0) {
            return 0;
        }
        if( a < 0) {
            return -b + multiply(a + 1, b);
        }
        return b + multiply(a - 1, b);
    }

}
