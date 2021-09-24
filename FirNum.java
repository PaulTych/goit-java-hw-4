package HW4;

public class FirNum {
    public int calc(int n){
        return n;
    }
}

class FirNumSum extends FirNum{

    @Override
    public int calc(int n){
        int result =0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}

class FirNumFactorial extends FirNum{

    @Override
    public int calc(int n){
        int result =1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

class FirNumMultiplyOdd extends FirNum{

    @Override
    public int calc(int n){
        int result =1;
        for (int i = 1; i <= n; i=i+2) {
            result *= i;
        }
        return result;
    }
}
class FirNumFizzBuzz extends FirNum{

    @Override
    public int calc(int n){
        int result =0;
        for (int i = 1; i <= n; i++) {
            if ((i%3==0||i%5==0)&&i%15!=0) {
                result += i;
            }
        }
        return result;
    }
}

class FirNumBasis extends FirNum{

    @Override
    public int calc(int n){
        int result =0;
        for (int i = 0; i <= n; i=i+2) {
            if (i%2==0) {
                result += i;
            }
        }
        return result/2;
    }
}