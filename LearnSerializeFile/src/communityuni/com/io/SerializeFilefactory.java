package communityuni.com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeFilefactory {
	public static boolean luuFile(Object data, String path)
	{
		try {
			FileOutputStream fos= new FileOutputStream(path);
			ObjectOutputStream oss= new ObjectOutputStream(fos);
			oss.writeObject(data);
			oss.close();
			fos.close();
			return true;

		} 
		catch (Exception ex) {
			return false;
		}
	}
		public static Object docFile(String path)// luu la doi tuong object  thi doc cung la object
		{
			try {
				FileInputStream fis = new FileInputStream(path);
				ObjectInputStream ois = new ObjectInputStream(fis);
				Object data=ois.readObject();
				ois.close();
				fis.close();
				return data;
			}
			catch (Exception ex) {
				ex.printStackTrace();		}
			return null;
		}
	}
	

