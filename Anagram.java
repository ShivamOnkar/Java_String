//silent and listen have the same alphabet
import java.util.Arrays;
public class Anagram {
    public static void main(String args[]){
        String s1 = "Silent";
        String s2= "listen";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length()==s2.length()){
           char ch1[] = s1.toCharArray(); 
           char ch2[] = s2.toCharArray();
           Arrays.sort(ch1);
           Arrays.sort(ch2);
          // System.out.println(Arrays.toString(ch1));
           //System.out.println(Arrays.toString(ch2));\
           if(Arrays.equals(ch1,ch2)){
            System.out.println("Anagram Strings");
           }else{
            System.out.println("NOt Anagram String");
           }

        }else{
            System.out.println("Not Anagram String");
        }
    }
    
}
