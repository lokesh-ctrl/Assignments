public class Fibanocci {
    public static int fibanocciNumber(int number) {
        if (number==1 || number==2) {
            return 1;
        }
        else {
            int fibanocciNum;
            fibanocciNum=fibanocciNumber(number-1)+fibanocciNumber(number-2);
            return fibanocciNum;
        }
    }
}
