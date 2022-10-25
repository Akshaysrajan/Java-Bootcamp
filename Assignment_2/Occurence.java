package Assignment_2;

public class Occurence {
    public static void main(String[] args) {

        int n = 1202922;
        int count = 0;
        while(n>0){

            int l = n%10;
            if (l == 2){
                count++;
            }
            n = n/10;
        }

        System.out.print(count);
    }
}
