import java.util.Date;

public class Vehicle {
private int vid;
private String vname;
private String vtype;
private Date dpurchase;


public Vehicle() {
	vid = 15;
	vname =null;
	vtype=null;
	dpurchase=null;
}

public Vehicle(int id, String vname, String vtype, Date db) {
	vid = id;
	this.vname =vname;
	this.vtype=vtype;
	dpurchase=db;
}

public void setVid(int id)
{vid = id;
	
}

public void setVname(String vname)
{this.vname =vname;
	
}

public void setVtype(String vname)
{this.vtype=vtype;
	
}

public void setDpurchase(Date db)
{dpurchase=db;
	
}

public int getVid()
{return vid;
	
}

public String getVname()
{return vname;
	
}

public String getVtype()
{return vtype;
	
}

public Date getDpurchase()
{return dpurchase;
	
}

public String toString() {
	return "Id:"+vid+"Owner Name:"+vname+"Vehicle Type:"+vtype+"Date of Purchase:"+dpurchase;
}













}
