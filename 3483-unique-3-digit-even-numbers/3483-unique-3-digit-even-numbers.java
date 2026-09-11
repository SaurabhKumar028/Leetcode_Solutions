class Solution {
    int count = 0;

    void helper(ArrayList<Integer> input, ArrayList<Integer> output) {

        if (output.size() == 3) {
            if (output.get(2) % 2 == 0) {
                count++;
            }
            return;
        } 

        HashSet<Integer> set = new HashSet<>();

        for (int j = 0; j < input.size(); j++) {
            
            int x = input.get(j);

            if (set.contains(x)) {
                continue;
            }

            set.add(x);

            if (output.size() == 0 && x == 0) {
                continue;
            }

            ArrayList<Integer> ip = new ArrayList<>(input);
            ArrayList<Integer> op = new ArrayList<>(output);

            op.add(ip.get(j));
            ip.remove(j);

            helper(ip, op);
        }
    }

    public int totalNumbers(int[] digits) {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();

        for (int a : digits) {
            input.add(a);
        }

        helper(input, output);

        return count;
    }
}