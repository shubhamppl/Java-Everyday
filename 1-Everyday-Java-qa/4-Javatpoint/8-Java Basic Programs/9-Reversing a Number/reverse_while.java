public class reverse_1 {
    public static void main(String args[]){
        int num = 123;
        int rem =0, rev = 0;
        while(num>0){
            rem = num%10;
            rev = rem + 10*rev;
            num = num/10;
        }
        System.out.println("The reversed number is " + rev);
    }
}
