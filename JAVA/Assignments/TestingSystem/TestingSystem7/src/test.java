public class test {
    public static void main(String[] args) {
        String sourceFile = "A:\\BB\\C";
        String[] s = sourceFile.split("/");
        String a = s[s.length-1];
        System.out.println(a);
        for (String x: s
             ) {
            System.out.println(x);
        }
    }
}
