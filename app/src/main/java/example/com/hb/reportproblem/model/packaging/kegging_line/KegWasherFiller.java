package example.com.hb.reportproblem.model.packaging.kegging_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class KegWasherFiller implements INode, ISimpleNode {
//    Keg - Washer/Filler
//    Tank caustic
//    Hệ thống điện và điều khiển
//    Tank nước nóng
//    Đầu rửa số (1)
//    Đầu rửa số (2)
//    Đầu rửa số (3)
//    Đầu rửa số (4)
//    Đầu counterpressure CO2 (5)
//    Đầu chiết bia (6)
//    Hệ thống khí nén, CO2
//    Hệ thống cấp hơi, nước ngưng
//    Hệ thông bơm
//    Các thiết bị an toàn của máy
//    Thanh nâng và di chuyển keg
//    Khung, gầm máy

    @Override
    public String getName() {
        return "Keg - Washer/Filler";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Keg - Washer/Filler");
        list.add("Tank caustic");
        list.add("Hệ thống điện và điều khiển");
        list.add("Tank nước nóng");
        list.add("Đầu rửa số (1)");
        list.add("Đầu rửa số (2)");
        list.add("Đầu rửa số (3)");
        list.add("Đầu rửa số (4)");
        list.add("Đầu counterpressure CO2 (5)");
        list.add("Đầu chiết bia (6)");
        list.add("Hệ thống khí nén, CO2");
        list.add("Hệ thống cấp hơi, nước ngưng");
        list.add("Hệ thông bơm");
        list.add("Các thiết bị an toàn của máy");
        list.add("Thanh nâng và di chuyển keg");
        list.add("Khung, gầm máy");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}