package ex_03_Literals;

public class Lab034_Literal_char {
    public static void main(String[] args) {

        //char -> store;
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' ';

        //escape char;
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Shweta" + new_line+ "Patil");
        System.out.println("Shweta" + tab_line+ "Patil");
        System.out.println("Shweta" + back_space+ "Patil");
        System.out.println("Shweta" + carriage_return+ "Patil");

        char c10 = 'A';
        char Rs = '₹';

        System.out.println("shweta has Rs-" +Rs+10);
    }
}
