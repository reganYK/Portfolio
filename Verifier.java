public class Verifier{

	protected int num;
	
	Verifier (int n){
		this.num = n;
	}
	
	public boolean isEven (){
		return this.num % 2 == 0;
	}
	
	public int getPower(int x){
		return (int) Math.pow (this.num, x);
	}
	
}
