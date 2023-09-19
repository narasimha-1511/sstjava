public class implarrayList {
    int []arr;
    int size;
    public implarrayList(){
        arr =new int[4];
        size = 0;
    }
    public implarrayList(int cap){
        arr = new int[cap];
        size=0;
    }
    
    int size(){
        return this.size;
    }
    int get(int i){
      return arr[i];
    }
    void add(int a){
        if(this.arr.length!=this.size){
        this.arr[size]=a;
        this.size++;
        }else{
         int newarr[] = new int[this.arr.length*2];
         for(int i=0;i<this.arr.length;i++){
            newarr[i]=arr[i];
         }
         newarr[this.arr.length]=a;//This is the element Needes To be Addeds
         this.arr = newarr;
         this.size++;
        }
    }
}
