
class EX7_3 {
    public static void main (String args[]){
     child2 c =new child2();
     c.method();
    }
}

class parent2 {int x= 10;}
class child2 extends parent2{
        void method(){
            System.out.println("x="+x);
            System.out.println("this.x="+this.x);
            System.out.println("super.x="+super.x);

        }
    }

