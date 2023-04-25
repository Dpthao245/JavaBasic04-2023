package DPThao.JavaBasic.BT03;

public class DieuKien {

        public static int number = 100;
        public static int n;

    public static void main(String[] args) {

        DieuKien ThamSo = new DieuKien();
        ThamSo.SoSanh(50);

        if (n == number) {
            System.out.println("50 bang 100");
        } else if (n < number) {
            System.out.println("50 nho hon 100");
        } else {
            System.out.println("50 lon hon 100");
        }
    }

        public void SoSanh(int n) {
            this.n = n;
        }
}
