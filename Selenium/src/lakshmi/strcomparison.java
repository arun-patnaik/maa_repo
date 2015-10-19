package lakshmi;

public class strcomparison {

	public static void main(String[] args) {
    String str="qedge";
    String str1="bhghgegf";
   if(str.contains(str1))
   {
	   System.out.println("string is same");
   }
   else
   {
	   System.out.println("string is different");
	   
   }
	String i="ajju";
	String j="ajju";
	if(i.contentEquals(j))
	{
		System.out.println("both are same");
	}
	else
	{
		System.out.println("not same");
	}

	}

}
