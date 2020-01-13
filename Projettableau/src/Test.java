
public class Test {

	public static void main(String[] args) {
		
		//testintv1();
		//testintv2(); 
		//teststringv1();
		//teststringv3();
		//teststringv4();
		//testcalcul();
		//testaffichagetableau();
		//testDoubleTableauv2();
		test();
	}
	
	static void test(){
		int[]tab; // declaration
		tab= new int [3] ;// creation du tableau+initialisation par defaut
		tab[0]=10; //initialisation par utilisateur
	}
	
	
	
	static void testDoubleTableauv2() { // deuxieme methode en ecrasant le tableau 1 doc permet d avoir + d espace
		int[] tab1 = { 10, 20, 30, 40 };
		affichetableau(tab1);// 10 20 30 40
		doubleTableau2(tab1);
		affichetableau(tab1);// 20 40 60 80
	}
	
	static void doubleTableau2(int[] x) { // g enlever static int car on n a plus de return
		
		for (int i = 0; i < x.length; i++)
			x[i] *=2 ;
		
	}
	
	
	
	
	
	
	
	
	
	static void testDoubleTableauv() {
		int[] tab1 = { 10, 20, 30, 40 };
		affichetableau(tab1);// 10 20 30 40
		int[] tab2=doubleTableau(tab1);
		affichetableau(tab2);// 20 40 60 80
	}
	static int[] doubleTableau(int[] x) {
		int[] y = new int[x.length];
		for (int i = 0; i < x.length; i++)
			y[i] = x[i] * 2;
		return y;
	}
	
	
	
	static void testcalcul(){
		int x=10;
		int y=5;
		int [] res= calcul (x,y);
		System.out.println(x+ "\t\t+y); ");
		System.out.println(res[0] + "\t\t"+ res [1]);
		
	}
	static int[] calcul(int a, int b){
		int[] tab =new int [2];
		tab[0]=a+b;
		tab[0]=a-b;
		return tab; 
	}

	
	
	
	
	
	static void affichetableau(int[] x){
		for (int e:x)
			System.out.print(e +"\t");
			System.out.println();
	}
	
	static void affichetableau(String[] x){
		for (String e:x)
			System.out.print(e+"\t");
		    System.out.println();
	}
	
	static void testaffichagetableau(){
		int []tab1= {10,20,30};
		int[] tab2 = {1,2,30,40,50,60,80};
		String [] tab3 =  {"aaa"+"bbb"+"cccc"}; 
		affichetableau (tab1);
		affichetableau (tab1);
		affichetableau (tab1);
		
		for (int e: tab1)
			System.out.println( e+"\t");
		for (int e: tab2)
			System.out.println( e+"\t");
			
	}
	
	static void teststringv4(){
		int[]	tab ={1,10,100}; 
		for (int e : tab); 
		System.out.println( "e" );
	}
	
	
	static void teststringv1(){
		String [] tab = {"aa","bb",null, "ccc"};
		
		for (int i=0; i<tab.length; i++)
			if (tab[i]!= null) 
			System.out.println(tab[i].toUpperCase());
		}
	
	
	
	static void testintv2(){
		int [] tab = new int [3];
		tab[0]=10;
		tab[2]=100;
		for (int i=0; i<tab.length; i++)
			System.out.println(tab[i]);
			
		
	}
	
	
		static void testintv1(){
			int [] tab = new int [3];
			System.out.println( tab[0]);
			tab[0]=10;
			System.out.println( tab[0]);
			
		
		

	}

}
