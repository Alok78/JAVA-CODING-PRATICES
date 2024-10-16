package arrays;

public class NextCharConvertor {

    public static void main(String[] args) {
        String input="Alok";
        String s = convertString(input);
        System.out.println(s);
    }

    public static String convertString(String input)
    {
        String result="";
        for (char ch:input.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                if(ch=='z')
                {
                    result+='a';
                }
                else if(ch=='Z')
                {
                    result+='A';
                }
                else{
                    result+=(char)(ch+1);
                }
            }
            else {
                result+=ch;
            }
        }
        return result;
    }
}
