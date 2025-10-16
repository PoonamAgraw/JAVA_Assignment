import java.util.Scanner;

public class TestTestArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1.Add Test.");
			System.out.println("2.Display Test.");
			System.out.println("3.Search by id.");
			System.out.println("4.Add new Question.");
			System.out.println("5.Find by Question id");
			System.out.println("6.Exit.");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				boolean status =TestService.addNewTest();
				if (status)
					System.out.println("test added successfully");
				else
					System.out.println("Error: Test not added");
				break;
			case 2:
				TestService.displayAll();
				break;
			case 3:
				System.out.println("enter testid to search");
				int tid = sc.nextInt();
				Test t = TestService.findById(tid);
				if (t != null) {
					System.out.println(t);
				} else {
					System.out.println("not found");
				}
				break;
			case 4:
				System.out.println("enter testid to add new question");
				tid = sc.nextInt();
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
				status = TestService.addNewQuestion( tid,qid,qnum, qtext, qmar, qopt,  qans);
				if (status)
					System.out.println("player added successfully");
				else
					System.out.println("Error: Team not found");
				break;
			case 5:
				System.out.println("enter tid to search");
				tid = sc.nextInt();
				Test test = TestService.findTestByQuestion(tid);
				if (test != null) {
					System.out.println(test);
				} else {
					System.out.println("player not found");
				}
				break;
			case 6:
				sc.close();
				System.out.println("Thank you for visiting.......");
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
		} while (choice != 6);
	}

}
