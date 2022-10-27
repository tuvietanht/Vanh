import java.util.Scanner;
import java.io.*;
import java.util.Scanner;
class Student{
        private int literature;
        private int english;
        private int mathA;
        private int mathB;
        private int social;
        private int natural;
        private int points;
               
        public int check(){
            Scanner p = new Scanner(System.in);
            int scores = p.nextInt();
            while (scores < 0 || scores > 100) 
            {
                System.out.print("The number must from 0 to 100 : ");
                scores = p.nextInt();   
            }
                return scores;
        }
        
        void setInformation(){
        System.out.print("literature points : ");
        int literature = check();       
        System.out.print("english points : ");
        int english = check(); 
          System.out.print("mathA points : ");
        int mathA = check(); 
          System.out.print("mathB points : ");
        int mathB = check(); 
          System.out.print("social points : ");
        int social = check(); 
          System.out.print("natural points : ");
        int natural= check(); 
          System.out.print("points : ");
        int points= check(); 
        this.english = english;
        this.literature = literature;
        this.mathA = mathA ;
        this.mathB = mathB ;
        this.points = points;
        this.social = social;
        this.natural = natural;
    }        
    int getLiterature(){
        return literature;
    }    
    int getEnglish(){
        return english;
    }
    int getmathA(){
        return mathA;
    }
    int getmathB(){
        return mathB;
    }
    int getSocial(){
        return social;
    }
    int getNatural(){
        return natural;
    } 
    //getAvg
    public int GetAvg(){
        int a = (literature + english + mathA + mathB + social+natural)*points;       
        return a;
    }  
    public void display(){
      System.out.print( literature +"\t\t" + english + "\t" + mathA + "\t" + mathB + "\t" + social + "\t" + natural + "\t" + points );  
   }

    //NoPassSubject
    public void NotPass(){
    if (literature < 60 ) 
    {
        System.out.println("Literature : " + literature );
    }
    if ( english < 60 ) 
    {
        System.out.println("English : "+ english);
    }
    if ( mathA < 60 ) 
    {
        System.out.println("mathA : " + mathA);
    }
    if ( mathB < 60 ) 
    {
        System.out.println("mathB : " + mathB);
    }
    if ( social < 60 ) 
    {
        System.out.println("Social : " + social);
    }
    if ( natural < 60 ) 
    {
        System.out.println("Natural : " + natural);
    }
}
    
}


public class Test22 {
    public static void setdisplay(int length){
            for ( int i = 0 ; i < length ; i++ )
            {
            System.out.print("-");
            }
    }   
    public static void main(String[] args){   
    System.out.print("How many Student you want to create : ");  
    Scanner p = new Scanner(System.in);  
    int num = p.nextInt();
    Student[] Students = new Student[num];
    
    
    //avg each subject
    int literatureAvg = 0 ;
    int englishAvg = 0 ;
    int mathAAvg = 0 ;
    int mathBAvg = 0 ;
    int socialAvg = 0 ;
    int naturalAvg = 0;
        for ( int j = 0 ; j < num ; j++)
        {
            System.out.println("Student " + (j+1) + ":");   
            Students[j] = new Student();   
            Students[j].setInformation();
            literatureAvg +=  Students[j].getLiterature();
            englishAvg +=  Students[j].getEnglish();
            mathAAvg += Students[j].getmathA();
            mathBAvg += Students[j].getmathB();
            socialAvg += Students[j].getSocial();
            naturalAvg += Students[j].getNatural();
            System.out.println();
        }
         literatureAvg = (literatureAvg/num);
         englishAvg = (englishAvg/num);
         mathAAvg = (mathAAvg/num);
         mathBAvg = (mathBAvg/num);
         socialAvg = (socialAvg/num);
         naturalAvg = (naturalAvg/num);
         
         
    while(true) {    
    System.out.println("1.Display all students infor 2.Score all students 3.The average score of each subject. 4.Outstanding student 5.Not pass Subject 6.Exit");   
    int select = p.nextInt();
    
    while(select <1 || select > 6) 
    {
        System.out.println("The number must from 1 to 6");
        int reselect = p.nextInt();
        select = reselect;
    }
    
    if ( select == 1)       //1.Display all students  
    {
       System.out.println("Number  literature   english   mathA   mathB social  natural points ");
       setdisplay(66);
       System.out.println();     
        for ( int j = 0 ; j < num ; j++)
        {
            System.out.print( (j+1 + "\t") );          
            Students[j].display();      
            System.out.println();       
        }  
    }  
    else if ( select == 2 )  // 2.Score all students
    {
        for ( int j = 0 ; j < num ; j++)
        {
            System.out.print( (j+1 + "\t") );          
            System.out.println("Student " + (j+1) + " : " + Students[j].GetAvg());          
        }
    }   
    
    else if ( select == 3) // 3.The average score of each subject
    {
        System.out.println("Literature avg score : "  + literatureAvg);
        System.out.println("English avg score : " + englishAvg );
        System.out.println("MathA avg score : " + mathAAvg );
        System.out.println("MathB avg score : " + mathBAvg );
        System.out.println("Social avg score : " + socialAvg );
        System.out.println("Natural avg score : " + naturalAvg );
    }
    else if ( select == 4 )  // 4.Outstanding student
    { 
        int maxAvgStudent = Students[0].GetAvg();
        int a = 0;
        for ( int i = 0 ; i < num ; i++)
        {
             if ( maxAvgStudent < Students[i].GetAvg()) 
             {
                 maxAvgStudent = Students[i].GetAvg();
                 a = i;
             }       
        }
        System.out.println("Student " +  (a+1) + " : " + maxAvgStudent  );
    }
           
    else if ( select == 5 ) // 5.Not pass Subject
    {
      System.out.println("The class Student didnt pass : ");
      for ( int i = 0 ; i < num ; i++)
      {
         System.out.println("Student " + (i+1) );
         Students[i].NotPass();
         System.out.println();
      }
    }   
    
    else
    {
        break; 
    }
                  
    }}} 
 
                   

               


    
    
    
    
    
    
     
    

    
  
    
    
    
    
                          
    
