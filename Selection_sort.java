public class Selection_sort {
    static void sele(int arr[])
    {
        //time complexity order of O(n)2
        int n=arr.length;
        
        for(int i=0;i<n-1;i++)
        {
           int miIndex=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[miIndex]){
                    miIndex=j;

                }

            }
            int temp=arr[miIndex];
            arr[miIndex]=arr[i];
            arr[i]=temp;

        }
    }
    public static void main(String[] args) {
      int arr[]={2,4,3,7,5};
      System.out.println("array before sort");
      printe(arr);
      System.out.println("after sorting");
      sele(arr);
      printe(arr);
    }
    static void printe(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
