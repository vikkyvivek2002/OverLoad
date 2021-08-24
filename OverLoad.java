class overloader
{
	void add(int a , int b)
	{
		System.out.println("value = "+(a+b));
	}
	void add(String x, String y)
	{
		System.out.println("value = "+(x+y));
	}
}
public class OverLoad
{
	public static void main(String[] args) {
		overloader obj = new overloader();
		obj.add(10,20);
		obj.add("vikky", "vivek");	
	}
}