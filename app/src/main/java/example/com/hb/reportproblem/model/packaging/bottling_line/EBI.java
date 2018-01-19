package example.com.hb.reportproblem.model.packaging.bottling_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class EBI implements INode, ISimpleNode {
//    EBI Machine Group
//    Băng tải đầu vào
//    Băng tải đầu ra
//    Băng tải trung tâm & Camera
//    Gầm máy, thành máy
//    Hệ thống điện và điều khiển
//    Các Pusher
//    Hệ thống khí nén

    @Override
    public String getName() {
        return "EBI";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("EBI Machine Group");
        list.add("Băng tải đầu vào");
        list.add("Băng tải đầu ra");
        list.add("Băng tải trung tâm & Camera");
        list.add("Gầm máy, thành máy");
        list.add("Hệ thống điện và điều khiển");
        list.add("Các Pusher");
        list.add("Hệ thống khí nén");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}