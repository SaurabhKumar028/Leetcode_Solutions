class Solution {
    public String interpret(String command) {

        char[] ch = command.toCharArray();
        String result = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '(') {
                result += ch[i];
            } else {

                if (ch[i + 1] == ')') {
                    result += 'o';
                    i++;
                }

                else {
                    int j = i + 1;

                    while (ch[j] != ')') {
                        result += ch[j];
                        j++;
                    }
                    i = j;
                }
            }
        }
        return result;
    }
}