
class EX7_3_1 {public static void main (String args[]){
    point3D p3 = new point3D(1,2,3);
    System.out.println("x="+p3.x+",y="+p3.y+",z="+p3.z);
}
}

class point{
    int x,y;

    point(int x, int y){
        this.x=x;
        this.y=y;
    }

    String getLocation(){
        return "x:"+x+",y:"+y;
    }
}

class point3D extends point{
    int z;

    point3D(int x, int y, int z){
        super(x,y);
        this.z=z;
    }

    String getLocation(){
        return "x:"+x+",y:"+y+",z:"+z;
    }
}