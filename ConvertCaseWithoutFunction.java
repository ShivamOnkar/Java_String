public class ConvertCaseWithoutFunction {
    public static void main(String args[]){
        String s = "He#lLo WO34rl/d";
        String s2 = "";
        System.out.println(s);
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                s2= s2 + (char) (s.charAt(i)-32);
            }
            else if(s.charAt(i)>=65 && s.charAt(i)<=90){
                s2 = s2 + (char) (s.charAt(i) + 32);
            }
            else{
                s2 =s2 + s.charAt(i);
            }

        }
        System.out.println(s2);
    }
}
