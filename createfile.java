import java.io.File;
import java.io.IOException;

class  createfile
{
	public static void main(String[] args) 
	{
      	try
		{
			File file= new File("F:/ myfile6.docx");
			if(file.createNewFile())
			System.out.println("Success");
			else 
				System.out.println("File Already exits");
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
