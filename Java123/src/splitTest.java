import java.io.*;
class splitTest{
public static void main(String args[]) throws IOException {
int m;
String sr = "Good#Learning#Environment";
String [] temp;
temp = sr.split("#");
for(m=0;m<temp.length;m++) {
System.out.println(temp[m]);
}
}
}
