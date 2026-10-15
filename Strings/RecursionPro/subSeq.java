package RecursionPro;

import java.util.ArrayList;

public class subSeq {
    public static void main(String[] args) {
        // without arraylist return type
        //subSequence("", "abc");

        // with the return type of arraylist
        System.out.println(subSequeArrayList("", "abchjklmnpoiuwqerstuv"));

    }
// it also included empty the last one 
    static void subSequence(String processed,String unProcessed){
        // base condition whenever unprocess get empty means we found the subsequence
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch= unProcessed.charAt(0);
        // we have need to do two things for subsequence take once or ignore once
        // taking
        subSequence(processed+ch, unProcessed.substring(1));
        // not taking 
        subSequence(processed, unProcessed.substring(1));
    }

    // same problem solution with arraylist return type

    static ArrayList<String> subSequeArrayList(String processed,String unProcessed){
        if(unProcessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unProcessed.charAt(0);
        // we have two side calls first one is left and another one is right combine for all ans

        ArrayList<String> left =subSequeArrayList(processed+ch, unProcessed.substring(1));
        ArrayList<String> right =subSequeArrayList(processed, unProcessed.substring(1));
        // combine both
        left.addAll(right);
        return left;


    }
}
