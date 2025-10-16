import java.util.Arrays;
import java.util.Date;

public class Test {
	private int tid;
	private String tname;
	private Date tdate;
	Question []qlst;
	private int size;
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test(int tid, String tname,Date date, Question[] qlst, int size) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tdate = date;
		this.qlst = qlst;
		this.size = size;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Date getTdate() {
		return tdate;
	}
	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}
	public Question[] getQlst() {
		return qlst;
	}
	public void setQlst(Question[] qlst) {
		this.qlst = qlst;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Test [tid=" + tid + ", tname=" + tname + ", tdate=" + tdate + ", qlst=" + Arrays.toString(qlst)
				+ ", size=" + size + "]";
	}

	


}
