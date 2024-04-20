public class Bubble_sort {
    static void bubbl(int arr[])
    {
        //time complexity order of n2
        int n= arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={22,33,55,23,77,99};
        System.out.println("array before sorting");
        printArr(arr);
        System.out.println("after sorting using bubbe sort");
        bubbl(arr);
        printArr(arr);


        
    }
    static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
