class TV{
    boolean power;
    int channel;

    void power(){power=!power;}
    void channelUp(){ ++channel;}
    void channelDown(){ --channel;}
}

class SmartTV extends TV{
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}

class EX7_1 {
    public static void main (String args[]){
        SmartTV STV =new SmartTV();
        STV.channel=10;
        STV.channelUp();
        System.out.println(STV.channel);
        STV.displayCaption("Hello, world");
        STV.caption=true;
        STV.displayCaption("hello, World");
    }
}
