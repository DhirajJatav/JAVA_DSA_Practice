package RecursionPro;

public class subset {
    
    public static void main(String[] args) {
        // this when i want to pass ans argument 
       // skip("", "bcaadd");
     //  String ans =skipWithTypeString("", "aaccbbdd");
      // System.out.println(ans);
      //printSub("", "abc");
      //skip("", "aabcca");

      removeWord("", "uuappledef");


    }
     // this when i want to pass ans argument 

    static void skip(String proString, String unproce){
        // base condition for this
        if(unproce.isEmpty()){
            System.out.println(proString);
        
            return ;
        }

        char ch =unproce.charAt(0);
        if(ch=='a'){
            skip(proString, unproce.substring(1));
        }
        else{
            skip(proString+ch, unproce.substring(1));
        }

    }

     // this when i dont  want to pass ans argument 

static String skipWithTypeString( String pro,String unproce){
   
        // base condition for this
        if(unproce.isEmpty()){
            return pro ;
        }
       
        char ch =unproce.charAt(0);
        if(ch=='a'){
             return skipWithTypeString( pro,unproce.substring(1));
        }
        else{
             return skipWithTypeString(pro+ch,unproce.substring(1));
        }

    }

    // if i have to remove the word from the string

    static void removeWord(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }


        // to remove a word
        char ch =up.charAt(0);
        if(up.startsWith("apple")){
            removeWord(p,up.substring(5));
        }
        else{
            removeWord(p+ch, up.substring(1));
        }

    }

    
    static void printSub(String  p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);

        printSub(p+ch, up.substring(1));
        printSub(p, up.substring(1));


    }


}
