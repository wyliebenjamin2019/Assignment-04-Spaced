public class Spaced{
    public static void main(String[] args){
        int x1 = 5;
        int y1 = 2;
        int z1 = -5;
        int x2 = 4;
        int y2 = 9;
        int z2 = 2;
        int x3 = -3;
        int y3 = 2;
        int z3 = 6;
        double d1 = Math.sqrt(Math.pow((double) ((x2-x1)), 2)+Math.pow((double) ((y2-y1)), 2)+Math.pow((double) ((z2-z1)), 2));
        double d2 = Math.sqrt(Math.pow((double) ((x3-x1)), 2)+Math.pow((double) ((y3-y1)), 2)+Math.pow((double) ((z3-z1)), 2));
        double d3 = Math.sqrt(Math.pow((double) ((x3-x2)), 2)+Math.pow((double) ((y3-y2)), 2)+Math.pow((double) ((z3-z2)), 2));
        double da = Math.max(d1,d2);
        double db = Math.max(da,d3);
        double dz = Math.min(d1,d2);
        double dx = Math.min(dz,d3);
        System.out.print("Longest distance: "+db+"\nShortest distance: "+dx);
    }
}
