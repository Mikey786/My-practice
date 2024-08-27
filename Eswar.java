class Box{
double len,bre,hei;
Box( double l, double b, double h){
    len = l;
    bre=b;
    hei=h;
}
Void display(){
    System.out.println("length : " + len);
    System.out.println("breadth : " + bre);
    System.out.println("height : " + hei);

}
double cal_vol(){
    return(len*bre*hei);
}


}
class BoxTest(){
    public static void main(String[] args) {
        Box ob = new Box(2.4,5.6,7.4);
        double v = ob.cal_vol();
        System.out.println("Box object ob : " + ob.display());
        System.out.println("Volume :" + v);
    }
}
