public class minelementinarray {
    public static void main(String[] args) {
        int arr[]= {90,65,2,99,1};
        int min= arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
