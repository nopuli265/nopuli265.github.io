package communityuni.com.model;

public class MyThread extends Thread {
public void run()
{
	super.run();
	try {
for (int i=0; i<10;i++)
{
		Thread.sleep(500);//trang thai blooks de cac tien trinhf khacs co cow hoi xen vao
	System.out.println(Thread.currentThread().getName()+":i="+i);
	} 
	}catch (InterruptedException ex) {
		// TODO Auto-generated catch block
		ex.printStackTrace();
	}
	
}
}

