package example.com.hb.reportproblem.model.packaging.kegging_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class KegWeigherGroup implements INode, ISimpleNode {
//    Keg - Weigher Group
//    Sensor báo keg
//    Bàn cân
//    Màn hình điều khiển
//    Băng tải của bàn cân

    @Override
    public String getName() {
        return "Keg - Weigher Group";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Keg - Weigher Group");
        list.add("Sensor báo keg");
        list.add("Bàn cân");
        list.add("Màn hình điều khiển");
        list.add("Băng tải của bàn cân");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}