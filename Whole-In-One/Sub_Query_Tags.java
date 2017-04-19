import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
class Sub_Query_Tags
{
private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String [] args)throws IOException
{
 String content = new String(Files.readAllBytes(Paths.get("SubQuery.txt")));

int count=0, token, start = 0;
String part;
PrintWriter pw= new PrintWriter("Sub_Tags.txt");

 while (content.indexOf("*", start) >= 0) {
   token = content.indexOf("*", start);
   part=content.substring(start, token);
   pw.println(part);
   start = token+1;
 }

 pw.close();
}
}
