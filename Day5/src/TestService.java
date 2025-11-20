import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class TestService {

	static Test [] tarr;
	static int cnt;
	static {
		tarr = new Test[5];
		Question [] qlst = new Question[10];
		qlst[0] = new Question(2, "Find Fruits name", 5, 3,"Banana" );
		tarr[0] = new Test(1,"Fruit",new Date(2023-9-07),qlst,2);
	}
	public static boolean addNewTest() {
		Scanner sc = new Scanner(System.in);
		if(cnt!=5) {
			System.out.println("Enter test id");
			int id = sc.nextInt();
			System.out.println("Enter test name");
			String name = sc.next();
			System.out.println("Enter test date");
			String dpurchase=sc.next();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date bd = null;
			try {
				bd = (Date) sdf.parse(dpurchase);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Question [] qlst = new Question[10];
			String ans ="y";
			int i=1;
			do {
				System.out.println("add new question id");
				int qid = sc.nextInt();
				System.out.println("add new question number");
				int qnum = sc.nextInt();
				System.out.println("enter question text");
				String qtext = sc.next();
				System.out.println("enter question marks");
				int qmar = sc.nextInt();
				System.out.println("enter question option");
				int qopt=sc.nextInt();
				System.out.println("enter question answer");
				String qans = sc.next();
				
				qlst[i] =new Question(qnum, qtext, qmar, qopt,  qans);
				i++;
				System.out.println("Do you want to add(y/n)");
				ans=sc.next();
			}
			while(ans.equals("y"));
		
		tarr[cnt]=new Test(id,name,bd,qlst,i);
		cnt++;
		return true;
	}
	return false;
	}
	
	public static void displayAll() {
		for(Test t:tarr) {
			if(t!=null) {
				System.out.println(t);
			}
			else {
				break;
			}
		}
		
	}
	public static Test findById(int tid) {
		// TODO Auto-generated method stub
		return null;
	}
	public static boolean addNewQuestion(int tid, int qnum, int qnum2, String qtext, int qmar, int qopt, String qans) {
		// TODO Auto-generated method stub
		return false;
	}
	public static Test findTestByQuestion(int tid) {
		// TODO Auto-generated method stub
		return null;
	}

}
