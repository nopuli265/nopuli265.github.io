package communityuni.com;

public class XuLiThrow {

	public static void Ptb1 (int a, int b) throws Exception
	{
		try {
			System.out.println("x = "+ (-b/a));
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Ptb1(0,5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
