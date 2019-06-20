package todo2;

public class Draw {
   protected int d, r ; 
   protected double Ca,result;
   

   public Draw()  {
	 
	d = r = 0;
	result = 0;
	   
   }

   public Draw(double Ca) {
	   this.Ca = Ca;
	   
   }
   


public double getCa() {
	return Ca;
}




public void setCa(double Ca) {
	this.Ca = Ca;
}




public double getR() {
	return r;
}




public void setR(int r) {
	this.r = r;
}




public double getResult() {
	return result;
}




public void setResult(double result) {
	this.result = result;
}

@Override
public String toString() {
	return "Draw [d=" + d + ", r=" + r + ", Ca=" + Ca + ", result=" + result + "]";
}



  

	

	

	
	
}
