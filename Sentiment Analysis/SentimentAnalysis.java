import java.io.*;
class SentimentAnalysis
{

public static void main(String[] args)throws IOException
{
  FileReader f=new FileReader("reviews.txt");
int c,i=1,x=0;
String bu[]=new String[5163];//calculated number of word in the file prior to this code
String st="";
String comm="";
char ch;
String pref="curl -d \"text=";
String suff="\" http://text-processing.com/api/sentiment/>> C:\\lists.txt\n";
FileOutputStream out=new FileOutputStream("result.txt");
while((c=f.read())!=-1)
{
  if((char)c=='"')
  while((char)(c=f.read())!='"')
  {
    st=st+(char)c;
  }
  if((i%2)!=0)
  {

    bu[x]=st;
    x++;
  }
  comm=pref+st+suff;

  for(int q=0;q<comm.length();q++)
  {
    ch=comm.charAt(q);
    out.write(ch);
  }

  //System.out.println(pref+st+suff);
  st="";
  comm="";
  i++;

}

f.close();
out.close();

}
}
