package example.com.hb.reportproblem.model.packaging.canning_line_2;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class WrapMachineGroup2 implements INode, ISimpleNode {
//    Wrap Machine Group -2
//    Hệ thống băng tải đầu vào và ra của máy
//    Khu vực chia lon (Layer forming)
//    Khu vực đẩy lon (Central pusher)
//    Khu vực phun keo (Glue group)
//    Khu vực đóng carton (Carton forming)
//    Khu vực cấp carton
//    Hệ thống điều khiển và thiết bị điện
//    Hệ thống bơm mỡ tự động
//    Hệ thông khí nén, van điều khiến, piston
//    Các thiết bị an toàn
//    Hệ thống khí nén
//    Hệ thống hơi
//    Hệ thống điện nguồn
//    Hệ thống khí CO2
//    Hệ thống nước cấp

    @Override
    public String getName() {
        return "Wrap Machine Group-2";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Wrap Machine Group -2");
        list.add("Hệ thống băng tải đầu vào và ra của máy");
        list.add("Khu vực chia lon (Layer forming)");
        list.add("Khu vực đẩy lon (Central pusher)");
        list.add("Khu vực phun keo (Glue group)");
        list.add("Khu vực đóng carton (Carton forming)");
        list.add("Khu vực cấp carton");
        list.add("Hệ thống điều khiển và thiết bị điện");
        list.add("Hệ thống bơm mỡ tự động");
        list.add("Hệ thông khí nén, van điều khiến, piston");
        list.add("Các thiết bị an toàn");
        list.add("Hệ thống khí nén");
        list.add("Hệ thống hơi");
        list.add("Hệ thống điện nguồn");
        list.add("Hệ thống khí CO2");
        list.add("Hệ thống nước cấp");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}