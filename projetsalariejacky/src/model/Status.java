package model;

public class Status {

	private int experience;
	private boolean isCadre;
	private final int experiencePivot = 3;

	public Status(int experience) {
		this.experience = experience;
		setIscadre();
	}

	public void setIscadre() {
		isCadre = (experience > experiencePivot) ? true : false;
	}

	public String toString() {
		return "Status [experience=" + experience + ", isCadre=" + ((isCadre==true) ? " cadre " : " pas cadre");
	}

}
