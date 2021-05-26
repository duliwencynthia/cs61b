package lab2;

public class intlist{
	public int first;
	public intlist rest;
	
	public static void main(String[] args) {
		intlist myList = new intlist(0, null);
	    myList.rest = new intlist(1, null);
	    myList.rest.rest = new intlist(2, null);
	    myList.rest.rest.rest = new intlist(3, null);
	    
	    intlist squarelist=myList.squarelistinteractive(myList);
	    while (squarelist!=null) {
	    	System.out.println(squarelist.first);
	    	squarelist=squarelist.rest;
	    }

	}

	
	public intlist(int x,intlist r) {
		first=x;
		rest=r;
	}
	
	public void dsquarelist(intlist l) {
		l.first=l.first*l.first;
		intlist q=l.rest;
		
		while(q!=null) {
			q.first=q.first*q.first;
			q=q.rest;
		}
	}
	
    public intlist squarelistinteractive(intlist l) {
    	intlist L=l;
    	L.first=L.first*L.first;
    	intlist q=L.rest;
    	
    	while (q!=null) {
    		q.first=q.first*q.first;
			q=q.rest;
    	}
    	
    	return L;
	}
    
    public intlist squarelistrecursive(intlist l) {
    	intlist L=l;
    	L.first=L.first*L.first;
    	L.rest=squarelistrecursive(L.rest);
    	
    	return L;
    }
    
    public intlist dcatenate(intlist A, intlist B) {
    	intlist q=A.rest;
    	
    	while (q.rest!=null) {
			q=q.rest;
    	}
    	
    	q.rest=B;
    	return A;
    	
    }
    
    public intlist catenate(intlist A, intlist B) {
    	intlist L=A;
    	intlist q=L.rest;
    	
    	while (q.rest!=null) {
			q=q.rest;
    	}
    	
    	q.rest=B;
    	return L;
    	
    }
    
}

