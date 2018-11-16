import java.util.*;
import java.util.Random;
public class philsLongOne{
  public static void main(String args[]){
        long []array={7270536038336708566L, 8019217342518227357L, 3040884611156577620L, 4971410678527411098L, 183064013267932758L, 8056584603037925167L, 1899884129638764508L, 5128941762697709445L, 5047244487910064394L, 3305601720113745382L, 5776953008539814370L, 34988082947722169L, 7434345681532331612L, 5407786886759427803L, 688068291500036320L, 2068510150417278708L, 1868790318480929054L, 3425404376196216488L, 1131190712360422749L, 102967645096808272L, 1445942735952374406L, 8456737838228485082L, 7623544032966572081L, 3942629391233399085L, 75109850685511728L, 223515536869223609L, 764673323466830185L, 2792331077502901882L, 8043871486090449356L, 8027891460874623856L, 9035205129603316628L, 5210176758109223792L, 6369027410439876015L, 719764136449271247L, 6275216998605832028L, 7518974182407464286L, 8228098362075889963L, 4364500170274364383L, 5160900320056121570L, 3574188741140445768L, 3799725687163235416L, 8971054323076859594L, 303947614746485290L, 4072768654844778108L, 422948319988286530L, 228169257627773589L, 4695919214544378987L, 5634695221137989240L, 2134479954298742138L, 7591363728605668117L, 227743280468209272L, 3815359581987719752L, 240831188333789404L, 1682051551566226L, 7028911732181187415L, 8534901095561461575L, 604981729275990578L, 4379371367686136078L, 2561184379973031673L, 3251231714574439892L, 8507596701451728093L, 1479176915196229414L, 4596908701725205546L, 7434222118200184219L};
       long array4[]=new long[1000000];
       long [] array2=new long[1];
    long [] array3=new long[1];
    long [] array5=new long[1];
   long num=0L;
                   Random generator = new Random();   
   for(int j=0;j<1000000; j++){
          
           //******generate the index and long randomly for array2[]*******
               
               int randomIndex = generator.nextInt(array.length);
               array2[0]=array[randomIndex];
                
               
             //******generate the index and long randomly for array3[0]*******
      
                 int randomIndex1 = generator.nextInt(array.length);
                   array3[0]=array[randomIndex1];  
                 
                   
                   if(array2[0]!=array3[0]){
                  array4[j]=array2[0]-array3[0];
                }
                   System.out.println(array4[j]);
           }      
           
                  
        for(int i=0; i<array.length;i++){
            if(array4[i]<array4[i+1]){
                array5[0]=array4[i];
                }
                else{
                    array5[0]=array4[i+1];
                }
            }
           int count=0;
                for(int i=0; i<array5.length; i++){
         
                    
             
                System.out.println(array5[0]);
                System.out.println(Long.toString(array5[0]).length());
                //System.out.println("The number " + array5[0] + " contains " + count + " numbers");
     
    
   }
  // Collections.sort(Arrays.asList(array));
  // System.out.println(array[0]);
}
}

  
        
          
