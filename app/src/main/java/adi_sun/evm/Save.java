package adi_sun.evm;

/**
 * Created by Adithya on 10/10/2015.
 */
public class Save {
    static String one,two,three,four,five;
    static int count1,count2,count3,count4,count5;
    static int win1,win2,finish=0;
    static int c[];String n[],t;
    static String winner;
    public  void getName(String a,String b,String c,String d,String e ){
         one=a;
         two=b;
         three=c;
         four=d;
         five=e;
    }
    public void getCount(int a,int b,int c,int d,int e){
        count1+=a;
        count2+=b;
        count3+=c;
        count4+=d;
        count5+=e;

    }
    public void check(){
     if (count1>count2){
         win1=count1;win2=count2;
            winner="THE WINNER IS "+one;
     }
        else {
         win1=count2;
         win2=count1;
         winner="THE WINNER IS "+two;
     }
        if (count3>win1){
            win2=win1;
            win1=count3;
            winner="THE WINNER IS "+three;
        }
        else if (count3>win2)win2=count3;
        if (count4>win1){
            win2=win1;
            win1=count4;
            winner="THE WINNER IS "+four;
        }
        else if (count4>win2)win2=count4;
        if (count5>win1){
            win2=win1;
            win1=count5;
            winner="THE WINNER IS "+five;
        }
        else if (count5>win2)win2=count5;
        if(win1-win2==0)winner="THERE IS A TIE!!";

    }

}
