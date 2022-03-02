class EX9_8 {
    public static void main (String[]args){
        char[]cArr = new char[0]; //길이가 0인 char배열을 생성한다. //char[]cArr={};와 같다.
        String s = new String(cArr); //String s =new String("");와 같다.

        System.out.println("cArr.length="+cArr.length);
        System.out.println("@@@"+s+"@@@");
    }
}
