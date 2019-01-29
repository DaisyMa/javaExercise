public class quickSort1 {
    public static void quickSort(int[] arr,int head,int tail){
        int i=head,j=tail;
        int pivot=arr[(i+j)/2];
        if(head>=tail || arr==null ||arr.length<=1){
           return;
        }

       while (i<=j){
           while (arr[i]<pivot){
               ++i;
           }
           while (arr[j]>pivot){
               --j;
           }
           if(i<j){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               ++i;
               --j;
           }else if(i==j){
               ++i;
           }
       }

       quickSort(arr,head,j);
       quickSort(arr,i,tail);
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1, 4, 8, 2, 55, 0, 11, 34};
        quickSort(arr,0,arr.length-1);
        String s="";
        for(int a:arr){
            s+=a+",";
        }
        System.out.println(s);
    }
}
