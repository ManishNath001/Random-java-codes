import javax.lang.model.util.*;

public class StringFrequency
{
    public static void main(String args[])
    {
        String s="Today(2nd October) is Gandhi Jayanti!";
        int len=s.length();
        int space=0, vowel=0, consonant=0, digit=0, special=0, upcase=0, lowcase=0;
        boolean b1,b2;
        for(int i=0;i<=len-1;i++)
        {
            if(s.charAt(i)==' ')
            {
                space++;
            }
            else if((s.getBytes(i)>=33 && s.getBytes(i)<=47) || (s.getBytes(i)>=58 && s.getBytes(i)<=64) || (s.getBytes(i)>=91 && s.getBytes(i)<=96) || (s.getBytes(i)>=123 && s.getBytes(i)<=126))
            {
                special++;
            }
            else if(s.charAt(i)=='1' || s.charAt(i)=='2' || s.charAt(i)=='3' || s.charAt(i)=='4' || s.charAt(i)=='5' || s.charAt(i)=='6' || s.charAt(i)=='7' || s.charAt(i)=='8' || s.charAt(i)=='9' || s.charAt(i)=='0')
            {
                digit++;
            }
            else
            {
                if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
                {
                    vowel++;
                    StringFrequency obj1=new StringFrequency();
                    b1=obj1.casecheck(s.charAt(i));
                    if(b1==true)
                    {
                        upcase++;
                    }
                    else
                    {
                        lowcase++;
                    }
                }
                else
                {
                    consonant++;
                    StringFrequency obj2=new StringFrequency();
                    b2=obj2.casecheck(s.charAt(i));
                    if(b2==true)
                    {
                        upcase++;
                    }
                    else
                    {
                        lowcase++;
                    }
                }
            }
            
        }
        System.out.println("White space: "+space);
        System.out.println("Number: "+digit);
        System.out.println("Special characters: "+special);
        System.out.println("Vowels: "+vowel);
        System.out.println("Consonant: "+consonant);
        System.out.println("Uppercase letters: "+upcase);
        System.out.println("lowercase letters: "+lowcase);
    }
    boolean casecheck(char a)
    {
        return (Character.isUpperCase(a));
    }
} 