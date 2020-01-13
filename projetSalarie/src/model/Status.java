package model;

public class Status {
private int experience;
private boolean isCadre;

private final int  experiencePivot= 3;




public String toString() {
	return "Status [experience=" + experience + ", isCadre=" + (isCadre ? "est cadre": "n'est pas cadre");
}

public Status(int experience) {
	this.experience = experience;
	setIscadre();
}
	
	public void setIscadre(){
		isCadre =(experience >experiencePivot)? true: false;
	}
	
	
} 




































