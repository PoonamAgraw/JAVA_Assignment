
public class Question {


   private int qnum;
   private String qtext;
   private int qmar;
   private int qopt;
   private String qans;
   
   
   public Question() {
	super();
	
}


public Question(int qnum, String qtext, int qmar, int qopt, String qans) {
	super();
	this.qnum = qnum;
	this.qtext = qtext;
	this.qmar = qmar;
	this.qopt = qopt;
	this.qans = qans;
}


public int getQnum() {
	return qnum;
}


public void setQnum(int qnum) {
	this.qnum = qnum;
}


public String getQtext() {
	return qtext;
}


public void setQtext(String qtext) {
	this.qtext = qtext;
}


public int getQmar() {
	return qmar;
}


public void setQmar(int qmar) {
	this.qmar = qmar;
}


public int getQopt() {
	return qopt;
}


public void setQopt(int qopt) {
	this.qopt = qopt;
}


public String getQans() {
	return qans;
}


public void setQans(String qans) {
	this.qans = qans;
}


@Override
public String toString() {
	return "Question [qnum=" + qnum + ", qtext=" + qtext + ", qmar=" + qmar + ", qopt=" + qopt + ", qans=" + qans + "]";
}

   
	
	
   
}

	


