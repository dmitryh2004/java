package task5;

public class StringEditorClass implements StringEditor {

    @Override
    public int stringSize(String str) {
        return str.length();
    }

    @Override
    public String getUnevenChars(String str) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < stringSize(str); i++)
        {
            if ((i+1) % 2 == 1)
            {
                temp.append(str.charAt(i));
            }
        }
        return temp.toString();
    }

    @Override
    public String invertString(String str) {
        StringBuilder temp = new StringBuilder();
        for (int i = stringSize(str) - 1; i >=0; i--)
        {
            temp.append(str.charAt(i));
        }
        return temp.toString();
    }
}
