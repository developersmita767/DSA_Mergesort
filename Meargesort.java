import java.util.Scanner;
class MergePro 
{
	static void merge(int arr[],int start,int mid,int end)
	{
		int i,j,k;
		int arr1[]=new int[arr.length];
		i=start;
		j=mid+1;
		k=start;
		while(i<=mid&&j<=end)
		{
			if(arr[i]<=arr[j])
			{
                arr1[k]=arr[i];
				i++;
				k++;
			}
			else
			{
				arr1[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<=mid)
		{
			arr1[k]=arr[i];
			i++;
			k++;
		}
		while(j<=end)
		{
			arr1[k]=arr[j];
			j++;
			k++;
		}
      for(i=0;i<arr1.length;i++)
		  arr[i]=arr1[i];
	}

	static void mergesort(int arr[],int start,int end)
	{
		
		int mid;
		if(start<end)
		{
			mid=(start+end)/2;
		//	System.out.println(start+" "+mid+" "+end);
			mergesort(arr,start,mid);
			mergesort(arr,mid+1,end);
			merge(arr,start,mid,end);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter array size :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter "+size+" elements ");
		int i;
		for(i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.println("before sorting elements are ");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		mergesort(arr,0,arr.length-1);
		System.out.println("after sorting elements are ");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}