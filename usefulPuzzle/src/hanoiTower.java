public class hanoiTower {
    public static void main(String[] args) {
        tower tower = new tower();
        tower.move(10,'a','b','c');
    }
}

class tower {
    public void move(int num,char a,char b,char c){
        if (num ==1 ){ // one pile
            System.out.println(a+"->"+c);
        }else{
            //many piles
            //move all the piles on bottom -> b
            move(num -1,a,c,b);
            //move the bottom to c
            System.out.println(a+"->"+c);
            //move others at b to c
            move(num-1,b,a,c);
        }
    }
}
