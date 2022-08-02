import java.io.*;
class ISS_decode
{
    
    String decode(String st)
    {
        
        String s = "";
        int i, len;
        char chr, ch;
        len = st.length();
        for(i = 0; i < len; i++)
        {
           
                chr = st.charAt(i);
                if(chr >= (char)65 && chr < (char)90)
                {
                    
                    ch = (char)((int)chr+1);
                    s = s + ch;
                    
                }
                if(chr == (char)90)
                    s = s + (char)65;
                if(chr == (char)32)
                    s = s + " "; 
                if(chr == (char)44)  
                    s = s + "," ;
                
        }  
        return s;    
    }
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the messege :");
        String str = br.readLine();
        str = str.toUpperCase();
        ISS_decode obj = new ISS_decode();
        String dec = "";
        dec = obj.decode(str);
        System.out.println("The Decoded String is :"+dec);
    }
}

