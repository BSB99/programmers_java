public class 외계행성의_나이 {
    public static void main(String[] args) {
        class Solution {
            public String solution(int age) {
                String[] answer = {"a","b","c","d","e","f","g","h","i","j"};
                String j = Integer.toString(age);
                String result = "";
                for (int i = 0; i < j.length(); i++) {
                    result += answer[j.charAt(i) - '0'];
                }
                return result;
            }
        }
    }
}
