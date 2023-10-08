package task9;

public class TwoZerosChecker {
    int count;
    int ZerosCount;
    int OnesCount;
    private String invertString(String str) {
        StringBuilder temp = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
        {
            temp.append(str.charAt(i));
        }
        return temp.toString();
    }

    private String toBin(int num, int length) {
        StringBuilder res = new StringBuilder();
        int temp = num;
        while (temp > 0)
        {
            res.append(Integer.toString(temp % 2));
            temp /= 2;
        }
        while (res.length() < length)
        {
            res.append("0");
        }
        return invertString(res.toString());
    }
    public TwoZerosChecker(int zerosCount, int onesCount) {
        ZerosCount = zerosCount;
        OnesCount = onesCount;
        count = 0;
    }

    public int getCount() {
        count = 0;
        int startNum = (int) Math.pow(2, ZerosCount + OnesCount) - 1;
        hasTwoZeros(startNum);
        return count;
    }

    void hasTwoZeros(int num) {
        String bin = this.toBin(num, ZerosCount + OnesCount);
        boolean has20 = false;
        int count0 = bin.length() - bin.replace("0", "").length();
        int count1 = bin.length() - bin.replace("1", "").length();
        if (num > 0)
            hasTwoZeros(num-1);
        if (!((count0 == ZerosCount) && (count1 == OnesCount)))
            has20 = true;
        if (bin.contains("00"))
            has20 = true;
        if (!has20)
            this.count++;
    }
}
