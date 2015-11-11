public class WordReverser{

    public WordReverser(){}//Constructor is unused at this point

    // This method provides a recursive method to reverse a string
    public String Reverse(String init){
        int x = init.length()-1;
        String reverse;

        if(x == 0){
            reverse = init;
        }
        else{
            reverse = (init.substring(x,(x+1)) + Reverse(init.substring(0, x)));
        }
        return reverse;
    }

    // This method provides a static method to reverse a string
    public static String Reverse2(String init){
        int y = init.length()-1;
        String str1;
        String str2 = init.substring(y,(y+1));
        String str3 = null;

        for(int x = init.length()-2; x>=0; x--){
            str1 = init.substring(x, (x+1));
            str3 = str2.concat(str1);
            str2 = str3;

        }
        return str3;
    }


}
