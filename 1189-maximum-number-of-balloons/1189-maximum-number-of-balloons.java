class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        int a = 0, b = 0, c = 0, d = 0, e = 0;
        for(char ch : text.toCharArray()){
            switch(ch){
                case 'b':
                a++;
                break;
                case 'a':
                b++;
                break;
                case 'l':
                c++;
                break;
                case 'o':
                d++;
                break;
                case 'n':
                e++;
                break;
            }
        }

        return Math.min(a, Math.min(b,Math.min(c/2,Math.min(d/2,e))));
    }
}