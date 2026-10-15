import java.util.Arrays;

public class basics{
    public static void main(String[] args) {
        System.out.println("hello strings");
        //String name="Dheeraj";
        // System.out.println(name);
        //  name ="Yaaro";
        // System.out.println(name);
        //     // here i changes variables refrence not the object dheeraj also exist

        // String s ="java";
        // s.concat("language");// not modified thats why strings are immuatable in java
        // System.out.println(s);

        // // to make changes give refrence 
        // s=s.concat("dsa");
        // System.out.println(s);
        
        // Equals it compares the content of the varialbles
        // and here the concept of string pool (means many variable can point same obj )
    
        // when we use new keyword it creates a separate obj every time even the element exist
    //     String a = new String();
    //    System.out.println(a);
    //     a="hello";
    //     System.out.println(a);



    // // Strings are immutable in java
    // String s=new String("Legend");
    // s.replace('L', 'l');
    // System.out.println(s);

    // // // Concept of Charat and subString concept
    // String favCompany= new String("Microsoft");
    // System.out.println(favCompany.charAt(0));

    // System.out.println(favCompany.substring(0,3));

        // compareTo is comapares letter through lexicographically(dictionary order
        // through unicode eg A=65 and B=66 and it checks first letter only 

        // String first="Apple";
        // String second="Ball";
        // // ans will be negative because 66-65 =-1;
        // System.out.println(second.compareTo(first));
        // String third=first.intern();// it will take rfrence to that apple which is inside the stringpool
        // // if it  was in the heap memory it will false 
        // System.out.println("Apple".equals(third));
        // // true because it is inside the string pool
        // String four= new String("Apple");
        // System.out.println(third.equals(four));
        // System.out.println(third);
        // System.out.println(new String("Apple")==third);// false because heap vs pool


        // trim()  this only remove asci space and strip() it removes special asci spaces also with special unicode chrarter also
        String name ="     Legend    Yaaro";
       // System.out.println(name.trim());
        //System.out.println(name.strip());
        // if special unicode comes then trim will fail here
        String text2 = "\u00A0Hello Unicode!\u00A0"; // non-breaking spaces
System.out.println(text2.trim());  // "\u00A0Hello Unicode!\u00A0" (unchanged)
System.out.println(text2.strip()); // "Hello Unicode!" (spaces removed)
String s = "\u2003Hello\u2003"; // em-space
System.out.println("[" + s.trim() + "]");
System.out.println("[" + s.strip() + "]");



        // split () it is used to separate words it returns an array of strings
        // String names="Dheeraj Rachna Nikita";
        // // as we know that strigs are immutable it will give new string 
        // String [] list=names.split(" ");
        // System.out.println(Arrays.toString(list));

        // // indexOf it is use to find the index of character 
        // System.out.println(names.indexOf("a"));
        // System.out.println(names.indexOf('a', 8));

        

    }
}