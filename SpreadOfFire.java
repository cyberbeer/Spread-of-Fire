public class SpreadOfFire{
	public static void main(String[] args) {
		int area=Integer.parseInt(args[0]);
		double prob=Double.parseDouble(args[1]);
		SpreadFire s1=new SpreadFire(area,prob);
		//Screen sc=new Screen(area,area);
		//System.out.println("a="+area);
		s1.init();
	}
}