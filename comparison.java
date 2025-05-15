import java.util.Scanner;

public class comparison
{

    public static String getSmallestAndLargest(String s, int k) 
    {
        String smallest =s.substring(0,k);
        String largest =smallest;
        for(int i=1;i<=s.length()-k;i++)
        {
            String tempvar=s.substring(i,k+i);
            smallest=((tempvar.compareTo(smallest))<0)?tempvar:smallest;
            largest=((tempvar.compareTo(largest))>0)?tempvar:largest;
        }
        
       
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }


}