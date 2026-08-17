class Solution {
    public String booleanOperations(boolean a, boolean b) {
        boolean x = a && b;
        boolean y = a || b;
        boolean z = !a;
        String s = x + " " + y + " " + z;
        return s;
    }
}
