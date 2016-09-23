import java.io.*;
class copyfile 
{
	public static void main(String[] args) throws IOException
	{
		BufferedWriter out1 = new BufferedWriter
			(new FileWriter("F:\newfile1.txt"));
		out1.write("Vaibhav kothari");
		out1.close();
		InputStream in = new FileInputStream
			(new File("F:\newfile1.txt"));
			OutputStream out = new FileOutputStream
			(new File("F:\newfile2.txt"));
		byte [] buf = new byte[1024];
		int len;
			while((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
		BufferedReader in1 = new BufferedReader
			(new FileReader("F:\newfile2.txt"));
		String str;
		while((str = in1.readLine()) != null) {
			System.out.println(str);
	}
	in.close();
	}
}
