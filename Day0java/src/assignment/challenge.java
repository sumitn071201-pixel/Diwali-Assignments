package assignment;

public class challenge {

	public static void main(String[] args) {
       
		
		String a[]= {"suyog","sarvesh","prathmesh"};
		String longest=a[0]; 
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()>longest.length())
			{
				longest=a[i];
			}
		}
		System.out.println("longest string is : "+longest);

 }
} 
