public class Lfour {
    public static void main(String[] args) {
        System.out.println("hii");
        
        int [] a={3,4,4,5,5,5,6,7,9};
           for(int i=0;i<a.length-1;i++){
             for(int j=i;j<i+1;j++){
                if(a[i]!=a[j]){
                    
                    System.out.println(a[i]);
                    
                }
             }

              
           }
       
        }
    }
    

