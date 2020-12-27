package communityuni.com.test;

import java.util.ArrayList;

import communityuni.com.io.TestFileFactory;

public class TestFile {

	public static void main(String[] args) {
/*ArrayList<String> dsData= new ArrayList<String>();
dsData.add("linh");
dsData.add("thao");
dsData.add("uyen");
boolean kq= TestFileFactory.luuFile(dsData, "E:/dulieutext.txt");
if (kq= true)
	System.out.println("luu file thanh cong");
else
	System.out.println("luu file that bai");*/
		ArrayList<String>dsData=TestFileFactory.docFile("E:/dulieutext.txt");
		for (String data:dsData)
		{
			System.out.println(data);
		}
	}

}
