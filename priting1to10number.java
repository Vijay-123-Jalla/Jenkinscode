public class recrusivetoprint10numbers {

	public static void main(String[] args) {
	printnumbers(1);	
	}
static int printnumbers(int n)
{
	if(n>10 || n==0)
	{
		return 0;
	}
	else  {
		//System.out.println(n);
		System.out.println("recrusivetoprint10numbers");
	return printnumbers(n+1);
}
}
}
