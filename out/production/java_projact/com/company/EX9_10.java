class EX9_10 {
    public static void main(String[]args){
        int iVal = 100;
        String strVal = String.valueOf((iVal)); //int를 String으로 변환한다.

        double dVal =200.0;
        String strVa12=dVal + ""; //실수 를 String으로 변환하는 또 다른 방법.

        double sum = Integer.parseInt("+"+strVal)+Double.parseDouble(strVa12);
        double sum2 = Integer.valueOf(strVal)+Double.valueOf(strVa12);

        System.out.println(String.join("",strVal,"+",strVa12,"=")+sum);
        System.out.println(strVal+"+"+strVa12+"="+sum2);
}
}
