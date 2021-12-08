import java.util.Arrays;

public class EX5_1 {public static void main(String[] args){
    int[] iArr1=new int[5];
    int[] iArr2=new int[5];
    int[] iArr3={10,20,30,40,50};
    char[]chArr={'a','b','c','d'};

    for(int i=0;i<iArr1.length;i++){
        iArr1[i] = i+1;
    }

    for(int i=0; i<iArr2.length;i++){
        iArr2[i]=(int)(Math.random()*10)+1;
    }

    for(int i=0;i< iArr1.length;i++){
      System.out.print(iArr1[i]+",");
    }
    System.out.println();

    System.out.println(Arrays.toString(iArr2));
    System.out.println(Arrays.toString(iArr3));
    System.out.println(Arrays.toString(chArr));
    System.out.println(iArr3);
    System.out.println(chArr);
}
}
