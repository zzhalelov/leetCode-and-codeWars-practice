package topic.string.convertDateToBinary;

public class ConvertDateToBinary {
    public String convertDateToBinary(String date) {
        String[] strings = date.split("-");
        String yearBinary = Integer.toBinaryString(Integer.parseInt(strings[0]));
        String monthBinary = Integer.toBinaryString(Integer.parseInt(strings[1]));
        String dayBinary = Integer.toBinaryString(Integer.parseInt(strings[2]));

        return yearBinary + "-" + monthBinary + "-" + dayBinary;
    }

    public static void main(String[] args) {
        ConvertDateToBinary convertDateToBinary = new ConvertDateToBinary();
        System.out.println(convertDateToBinary.convertDateToBinary("2080-02-29"));
    }
}