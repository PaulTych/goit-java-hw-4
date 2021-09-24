package HW4;

public class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        String result = "";
        int[] bills = {1000, 100, 10, 1};
        String[] currency = {"X", "Y", "Z", "*"};
        int tempCounter = this.count;
        int curCnt =0;
        int i = 0;
        while (tempCounter > 0) {
            curCnt = tempCounter / bills[i];
            tempCounter = tempCounter - curCnt*bills[i];
            for (int j = 0; j< curCnt; j++){
                result += currency[i];
            }
            i++;
        }
        return result;

    }

    }
