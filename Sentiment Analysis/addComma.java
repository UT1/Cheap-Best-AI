import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
class addComma
{
private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String [] args)throws IOException
{
 String content = new String(Files.readAllBytes(Paths.get("lists.txt")));
 System.out.println(content);
int count=0;
PrintWriter pw= new PrintWriter("listsnew.txt");
 for(int i=0;i<content.length();i++ )
 {

   if(content.charAt(i)=='}')
   {
     count ++;
     if(count%2==0)
     {
       content=content.substring(0,i+1)+","+content.substring(i+1,content.length());
     }
   }
 }
 content=content.substring(0,content.length()-2);
 System.out.println(content);
 pw.println(content);
 pw.close();
}
}
