package DPThao.JavaBasic.BT02;

public class Calculator {

    public static long tongHaiSoNguyen (long soNguyen01, long soNguyen02) {
        return soNguyen01 + soNguyen02;
    }

    public static double tichHaiSoThuc (double soThuc01, double soThuc02) {
        return soThuc01 * soThuc02;
    }
    public static void main(String[] args) {
        System.out.println("Tổng hai số nguyên: " + tongHaiSoNguyen( 3333 , 4444));
        System.out.println("Tích hai số thực: " + tichHaiSoThuc(1.33 , 43.34));
    }
}
