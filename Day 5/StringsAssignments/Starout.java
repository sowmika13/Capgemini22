package StringsAssignments;

public class Starout {
	public String starOut(String str) {
		  String str1 = "";
		  int count = 0;
		  int[] x = new int[str.length()*2];
		  boolean v = true;
		  if(str.equals("*"))
		  {
		    return "";
		  }
		  for(int i = 0;i<str.length();i++)
		  {
		    if(str.substring(i,i+1).equals("*"))
		    {
		       x[count]=i-1;
		       x[count+1]=i;
		       x[count+2]=i+1;
		       count+=3;
		    }
		  }
		  for(int j = 0;j<str.length();j++)
		  {
		     for(int p = 0;p<count;p++)
		     {
		       if(j==x[p])
		       {
		         v = false; 
		       }
		     }
		     if(v)
		     {
		      str1+=str.substring(j,j+1);
		     }
		     else{
		      v = true;
		      }
		  }
		 
		  return str1;
		}

}
