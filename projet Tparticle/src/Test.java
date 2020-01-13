
public class Test {

	public static void main(String[] args) {
		
		//Article ();
		Article1 ()	;
	}

	
	static void Article1 () {
		Article a1 = new Article () ;
		a1.marque  = "dior";
		
		
		Article a2 = new Article () ;
		a2.marque  = "lu";
		a2.prix= 3;
		
		Article a3 = new Article () ;
		a3.marque  = "nike";
		a3.prix= 4;
		
		Article []tab ={a1, a2, a3};
		for (Article a:tab)
		
	}
	
	static void Article () {
		Article a1 = new Article () ;
		a1.marque  = "dior";
		a1.prix= 2;
		
		Article a2 = new Article () ;
		a2.marque  = "lu";
		a2.prix= 3;
		
		Article a3 = new Article () ;
		a3.marque  = "nike";
		a3.prix= 4;
		
		Article []tab ={a1, a2, a3};
		for (Article a:tab)
		
		System.out.println(a.getInfo());
		
		
		 
	}
}

