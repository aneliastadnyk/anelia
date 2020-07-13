public class Homework {
    /*     1) 2*12+45(54-1)/43-23+2
          2) 12*12-45/10+11;
          3) 12,5+32*4*2*9(23-7+11+8)/9
          4) 9+11-34/2+1             */

    public static void main(String[] args) {
        int a = 2;
        int b = 12;
        int c = 45;
        int d = 54;
        int e = 1;
        int f = 43;
        int g = 23;
        int t = 10;
        int n = 11;
        double r = 12.5;
        int y = 32;
        int x = 4;
        int u = 9;
        int j = 7;
        int w = 8;
        int s = 34;


        int k = a*b+c*(d-e)/f-g+a;   // 1 приклад
        int v = b*b-c/t+n;         // 2 приклад
        double q = r+y*x*a*u*(g-j+n+w)/u;    //3 приклад
        int h = u+n-s/a+e;         // 4 приклад
        System.out.println("First example:" + k);
        System.out.println("Second example:" + v);
        System.out.println("Third example:" +q);
        System.out.println("Fourth example:" + h);
    }
}
