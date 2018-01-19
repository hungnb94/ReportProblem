package example.com.hb.reportproblem.model.packaging.bottling_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class LabellerMachineGroup implements INode, ISimpleNode {
//    Labeller Machine Group
//    Băng tải đầu vào&blower
//    Trạm nhãn 1
//    Trạm nhãn 2
//    Trạm nhãn 3
//    Trạm nhãn 4
//    Trạm nhãn 5
//    Trạm nhãn 6
//    Cụm đầu vào, Infeed worm
//    Cụm trung tâm máy
//    Khung máy, thành máy
//    Hệ thống bôi trơn trung tâm
//    Cụm starwheel đầu ra
//    Camera, Coder, Check-mat & Taptone
//    Băng tải đầu ra & WAX
//    Các thiết bị an toàn của máy
//    Hệ thống khí nén
//    Hệ thống điện và điều khiển
//    FHI 2

    @Override
    public String getName() {
        return "Labeller Machine Group";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Labeller Machine Group");
        list.add("Băng tải đầu vào&blower");
        list.add("Trạm nhãn 1");
        list.add("Trạm nhãn 2");
        list.add("Trạm nhãn 3");
        list.add("Trạm nhãn 4");
        list.add("Trạm nhãn 5");
        list.add("Trạm nhãn 6");
        list.add("Cụm đầu vào, Infeed worm");
        list.add("Cụm trung tâm máy");
        list.add("Khung máy, thành máy");
        list.add("Hệ thống bôi trơn trung tâm");
        list.add("Cụm starwheel đầu ra");
        list.add("Camera, Coder, Check-mat & Taptone");
        list.add("Băng tải đầu ra & WAX");
        list.add("Các thiết bị an toàn của máy");
        list.add("Hệ thống khí nén");
        list.add("Hệ thống điện và điều khiển");
        list.add("FHI 2");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}