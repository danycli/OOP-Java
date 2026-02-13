// Needs alot more Improvements

package addingBinaryNums;

public class binary {

        public static boolean ChkBinary(int binNum){
            boolean b = true;
            while(binNum!=0){
                int chk = binNum%10;
                if(chk < 0 || chk > 1){
                    b = false;
                    break;
                }
                binNum/=10;
            }
            return b;
        }
        
        public static double binToDec(int n){
            int count1 = 0;
            double sum1 = 0;
            while(n != 0){
            int num = n % 10;
            sum1 += (num*Math.pow(2.0, count1));
            count1++;
            n/=10;
        }
        return sum1;
        }

        public static void DecToBin(int sum1, int first, int second){
            int count1 = 0;
            int bin = (int)sum1;
            while(bin != 0){
                bin/=2;
                count1++;
            }
            bin = sum1;
            int[] ar = new int[count1];
            int inc = 0;
        
            while(bin != 0){
                int p = bin%2;
                bin /= 2;
                ar[inc] = p;
                inc++;
            }
            System.out.print("The Binary sum for the "+first+" and "+second+" is : ");
            if(count1 != 0){
            for(int i = count1 - 1; i >=0; i--){
                System.out.print(ar[i]);
            }
        }else{
            System.out.println("0");
        }
        }
    }
