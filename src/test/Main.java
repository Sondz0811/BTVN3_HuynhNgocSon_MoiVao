
package test;

import model.Giaovien;
import model.Monhoc;
import model.Student;
public class Main {
    public static void main(String[] args) {
        Giaovien gv = new Giaovien(13,"Huynh Ngoc Son",878,"QuangNam");
        Student st = new Student(14,879,"Thu Trang","Danang","Nu");
        Monhoc mh = new Monhoc(15,"Toan");
        System.out.println(gv.getIdGV() + " : " + gv.getNameGV());
        System.out.println(st.getIdS() + " : " + st.getNameS() +' '+ "gioitinh:"+ st.getGioitinhS());
        System.out.println(mh.getIdMonhoc() + " : " + mh.getNameMonhoc());
    }
}
