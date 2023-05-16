package BT05;

import java.util.ArrayList;

public class LearnArrayList {

    public static void main(String[] args) {

        //Khai báo arrayList

        ArrayList<String> arrayList = new ArrayList<String> ();

        System.out.println("Thông tin cơ bản của nhân viên: ");

        //Thêm phần tử vào arrayList

        arrayList.add("Tên nhân viên: DPThao");
        arrayList.add("Địa chỉ: Cần Thơ");
        arrayList.add("Số điện thoại: 0795499632");
        arrayList.add("Email: dpthao245@gmail.com");

        //Duyệt arrayList - Dùng For cơ bản

        for ( int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
