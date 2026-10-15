package RecursionPro;

public class skipString {
    public static void main(String [] args){
        // to remove a string from a string
       String ans=skipApple("Ruokapplebaby");
       System.out.println(ans);
    }

    static String skipApple(String up) {
    if (up.isEmpty()) {
        return "";
    }

    if (up.startsWith("apple")) {
        return skipApple(up.substring(5));
    } else {
        return up.charAt(0) + skipApple(up.substring(1));
    }
}
}