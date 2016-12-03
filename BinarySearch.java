import java.util.Scanner;

public class BinarySearch
{
public void binarySearch(int []A,int start,int end)
{
int mid = (start + end)/2;
System.out.print("Enter the Searching value: ");
Scanner sc = new Scanner(System.in);
int search = sc.nextInt();

while(start < end)
{
if(search < A[mid])
end = mid -1;
else if(search == A[mid])
{
System.out.println("Searching value "+search+" is found at index "+mid);
break;
}
else
start = mid + 1;

mid= (start + end)/2;
}

System.out.println("Searching value "+search+" not found");
}
}
