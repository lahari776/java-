public class largeandsmall {
    public static int largest(int[] array){
        int l=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>l){
                l=array[i];
            }
        }
        return l;
    }
    public static int smallest(int[] array){
        int s=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<s){
                s=array[i];
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int arr[]={1,2,9,8};
        System.out.println(largest(arr)+","+smallest(arr));
    }
}
