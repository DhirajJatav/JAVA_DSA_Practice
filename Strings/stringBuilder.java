public class stringBuilder {
    
    public static void main(String [] args){
        //System.out.println("hello");
        StringBuilder str = new StringBuilder("Hello");

        // common methods which we can perfrom on StringBuilder
        str.append(" Rachna");
        // System.out.println(str);// Hello Rachna
        str.delete(0, 5);
        // System.out.println(str);// Rachna
        // str.insert(5, 'D'); // it set the letter on index which we pass
        // System.out.println(str);//
         StringBuilder str2= new StringBuilder("Dheeraj");
        // str2.replace(4, 7, "Ra");
        // System.out.println(str2);

        String result = String.join("@",str.toString(), str2.toString());
        System.out.println(result);










    }

}
