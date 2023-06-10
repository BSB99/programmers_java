public class Main {
    public static void main(String[] args) {

        class Solution {
            public String solution(String my_string, int[][] queries) {
                char[] charArray = my_string.toCharArray();
                String result = "";
                for (int i = 0; i < queries.length; i++) {
                    int num = queries[i][0];
                    int num1 = queries[i][1];

                    result = changeStr(charArray, num, num1);
                }
                return result;
            }

            public String changeStr(char[] string, int a, int b) {
                for (int i = a; i <= (a+b)/2; i++) {
                    char str = string[i];
                    string[i] = string[a+b-i];
                    string[a+b-i] = str;
                }

                return new String(string);
            }
        }
    }
}