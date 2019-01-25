public class BubbleSort {
    public static Integer[] BubbleSort(Integer arr[]){
        int len=arr.length;
        int temp=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[j]<arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr={2,1,4,3,6};
        System.out.println(QuickSort.getTime());
        arr=BubbleSort(arr);
        System.out.println(QuickSort.getTime());
        for(Integer ar:arr){
            System.out.println(ar);
        }
    }
}
