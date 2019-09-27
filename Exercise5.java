
/**
 * クラス Exercise5 の注釈をここに書きます.
 * 
 * @author (jani)
 * @version (27/9/2019)
 */
public class Exercise5
{
   public static void main(){
       
       boolean []result= new boolean [30];
       for(int j =0 ;j<result.length;j++){
        result[j]=true;
        }
       for (int i=2;i<result.length;i++){
        if(sieve(result,i)){
            System.out.println(i);
        }
        }
       
    }
     public static boolean sieve(boolean[] n,int j){
      if (j<1){
        return false;
        }
      
      for (int number=2;number<=Math.sqrt(j);number++){
         if (j % number == 0){
            return false;
         }
      }
      return true;
   } 
}