
public class EX8_9 {public static void main (String args[]){
    try {
        method1();
    }catch (Exception e){
        System.out.println("에러처리");
    }
}
static void method1() throws Exception{
    method2();
}
static void method2()throws Exception{
    throw new Exception();
}
}
