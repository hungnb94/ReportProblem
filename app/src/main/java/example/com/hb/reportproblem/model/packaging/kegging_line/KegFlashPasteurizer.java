package example.com.hb.reportproblem.model.packaging.kegging_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class KegFlashPasteurizer implements INode, ISimpleNode {
//    Keg - Flash Pasteuriser
//    Các thiết bị an toàn của máy
//    Van Sampson
//    Buffer Tank
//    Tủ điều khiển Flash Pasteuriser
//    Hệ thống khí nén, CO2, hơi.
//    Tank nước nóng
//    Dàn trao đổi nhiệt
//    Tank Caustic
//    Hệ thống bơm
//    Các thiết bị instrument
//    Hệ thống điện và điều khiển

    @Override
    public String getName() {
        return "Keg - Flash Pasteurizer";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Keg - Flash Pasteuriser");
        list.add("Các thiết bị an toàn của máy");
        list.add("Van Sampson");
        list.add("Buffer Tank");
        list.add("Tủ điều khiển Flash Pasteuriser");
        list.add("Hệ thống khí nén, CO2, hơi.");
        list.add("Tank nước nóng");
        list.add("Dàn trao đổi nhiệt");
        list.add("Tank Caustic");
        list.add("Hệ thống bơm");
        list.add("Các thiết bị instrument");
        list.add("Hệ thống điện và điều khiển");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}