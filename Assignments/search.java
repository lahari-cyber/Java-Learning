class search {
public static void main(String args[]){
    int arr[]={3,2,10,5,4,6};
    int flg=-1;
    for (int i=0;i<6;i++){
        if(arr[i]==10){
            flg=1;
            break;
        }
    }
    if (flg==-1){
        System.out.println("not found");

    }else{
        System.out.println("found");
    }
}    
}
