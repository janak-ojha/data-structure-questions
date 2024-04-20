public class Insertion_sort {
    static void insert(int arr[])
    {
        int n=arr.length;
        for(int i=1;i<n;++i)
        {
            int key=arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;

        }
    }

    //worst time complexity order of n2
    //best order of n
    public static void main(String[] args) {
        int arr[]={2,4,3,6,5,8};
        System.out.println("before sorting");
        printes(arr);
        System.out.println("after sorting");
        insert(arr);
        printes(arr);

    }
    static void printes(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
