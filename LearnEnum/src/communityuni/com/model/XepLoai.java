package communityuni.com.model;

public enum XepLoai {
Gioi ("giỏi"),
kha ( "khá "),
	
tb ( " trung bình"),
yeu ( " yếu ");
	private String msg;
	XepLoai(String msg)
	{
		this.msg=msg;
	}
public String description()
{
	return this.msg;
}
}
