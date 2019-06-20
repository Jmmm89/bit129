package munje;

public class Emp {

	protected int saNum, pNum;
	protected String name, rank;
	
	public Emp () {
		saNum = 0; 
		pNum = 0;
		name = null;
		rank = null;
		
	}

	public int getSaNum() {
		return saNum;
	}

	public void setSaNum(int saNum) {
		this.saNum = saNum;
	}

	public int getpNum() {
		return pNum;
	}

	public void setpNum(int pNum) {
		this.pNum = pNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "Emp [saNum=" + saNum + ", pNum=" + pNum + ", name=" + name + ", rank=" + rank + "]";
	}
	
}
