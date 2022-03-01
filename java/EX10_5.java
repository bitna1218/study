import sun.security.krb5.internal.EncAPRepPart;

import java.util.Calendar;
import java.util.Stack;

public class EX10_5 {
    public static void main(String[]args){
        if (args.length !=2){
            System.out.println("Usage : java EX10_5 2019 9");
            return;
        }
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int START_DAY_OF_WEEK =0;
        int END_DAY=0;

        Calendar sDAY =Calendar.getInstance();
        Calendar eDAY =Calendar.getInstance();

        sDAY.set(year,month-1,1);
        eDAY.set(year,month,1);

        eDAY.add(Calendar.DATE,-1);

        START_DAY_OF_WEEK =sDAY.get(Calendar.DAY_OF_WEEK);

        END_DAY=eDAY.get(Calendar.DAY_OF_WEEK);

        System.out.println("     "+args[0]+"년 "+args[1]+"월");
        System.out.println(" SU MO TU WE TH FR SA");

        for(int i=1;i<START_DAY_OF_WEEK;i++)
            System.out.println("    ");
        for(int i=1, n=START_DAY_OF_WEEK;i<=END_DAY;i++,n++){
            System.out.println((i<10)?"  "+i : " "+i);
            if(n%7==0)System.out.println();
        }
    }
}
