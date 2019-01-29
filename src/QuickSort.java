import  java.util.Date;
import java.text.SimpleDateFormat;

public class QuickSort {
    public static String getTime(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSSSSSSSSSS");
        return sdf.format(new Date());

    }
    public static void quickSort(int arr[],int head,int tail){
        if(head >=tail || arr==null || arr.length<=1){
            return;
        }

        int i=head,j=tail,pivot=arr[(i+j)/2];
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
        int[] arr=new int[]{1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        System.out.println();
        System.out.println(getTime());
        quickSort(arr,0,arr.length-1);
        System.out.println(getTime());
        String s="";
        for(int a:arr){
            s+=a+",";
        }
        System.out.println(s);
    }
}
