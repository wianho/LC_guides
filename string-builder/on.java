// O(n^2)
public void appendNtimesUsingStringConcat(char c, int n) {
    String str = "";
    for (int i = 0; i < n; i++) {
        str += c;    // O(s) where s = length(str)
    }
    return str;
}
// O(n)
public void appendNtimesUsingStringBuilder(char c, int n) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
        sb.append(c);   // O(1)
    }
    return sb.toString();
}