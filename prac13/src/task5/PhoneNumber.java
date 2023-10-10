package task5;

public class PhoneNumber {
    String output;
    public PhoneNumber(String pn)
    {
        String last10 = pn.substring(pn.length() - 10);
        String countryCode;
        if (pn.charAt(0) == '+') //номер не из России
        {
            countryCode = pn.substring(0, pn.length() - 10);
        }
        else
        {
            countryCode = "8";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(countryCode).append(" ");
        sb.append(last10, 0, 3).append("-");
        sb.append(last10, 3, 6).append("-");
        sb.append(last10.substring(6));
        output = sb.toString();
        printOutput();
    }

    public void printOutput()
    {
        System.out.println(output);
    }
}
