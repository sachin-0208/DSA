class MoveZerosToEnd{
    static void moveZerosToEnd(int[] a){
        int index = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[index++]=a[i];
            }
        }
        while(index<a.length){
            a[index++]=0;
        }
        for(int element: a){
            System.out.print(element+" ");
        }
        
    }
    public static void main(String[] args){
        int[] arr = {1,0,3,5,12,0,2};
        moveZerosToEnd(arr);

    }
}