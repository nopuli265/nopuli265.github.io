package communityuni.com.test;

import communityuni.com.model.MyThread;
public class TestMyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread th1= new MyThread();
th1.start();
MyThread th2= new MyThread();
th2.start();
MyThread th3= new MyThread();
th3.start();
/* ta thây nó theo tuần tự là th1 th2 th3 nhưng 
thực tế là ta không biết trước được tiến trình nào 
chạy trước tiến trình nào chạy sau các tiến trình có thể xen vao nhau */
	}

}
