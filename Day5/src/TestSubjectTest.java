import java.util.Date;

public class TestSubjectTest {

	public static void main(String[] args) {
		Question[] qlst= {
				new Question(2, "Find Fruits name", 5, 3,"Banana"),
				new Question(3, "Find Flower name", 4, 2,"Lotus"),
				new Question(4, "Find Animal name", 3, 1,"Monkey")
				
		};
		
		Test t1=new Test(1,"Fruit",new Date(2023-9-07),qlst,2);
		System.out.println(t1);

	}


}
