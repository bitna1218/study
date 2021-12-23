
class EX7_3_1 {public static void main (String args[]){
    point3D p3 = new point3D(1,2,3);
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
        this.x=x;
        this.y=y;
        this.z=z;
    }

    String getLocation(){
        return "x:"+x+",y:"+y+",z:"+z;
    }
}