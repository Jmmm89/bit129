package day09_note;

public class Note01 {
public static void main(String[] args) {
	
	int score = 87;
	
	 char grd;
	switch (score/10) {
	case 10:
	case 9:
		grd = 'A';
		break;
	case 8:
		grd = 'B';
		break;
	case 7:
		grd = 'C';
		break;
	case 6:
		grd = 'D';
		break;
	default:
		grd = 'F';

	}
	
}
}
