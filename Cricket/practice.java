package Cricket;
public class practice{
    public static void main(String [] args){
        int a = 333;
        int c = 9999;

        int x = a%10;
        int b = 0;
        while(a!=0){
            int n = a%10;
            if(n!=x){
                b = 0;
                break;
            }else{
                b = 1;
            }
            a = a/10;
        }

        int y = c%10;
        int d = 0;
        while(c!=0){
            int n = c%10;
            if(n!=y){
                d = 0;
                break;
            }else{
                d = 1;
            }
            c = c/10;
        }

        if(b == d){
            System.out.println("The sum is : "+a+c);
        }else{
            System.out.println("The nums were not consecutive");
        }
    }
}