package example.com.hb.reportproblem.model.packaging.canning_line_2;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class FCIGoup2 implements INode, ISimpleNode {
//    FCI Goup-2
//    Pusher
//    Hệ thống khí nén
//    Tủ điện và hệ thống điều khiển
//    Các thiết bị an toàn

    @Override
    public String getName() {
        return "FCI Goup-2";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("FCI Goup-2");
        list.add("Pusher");
        list.add("Hệ thống khí nén");
        list.add("Tủ điện và hệ thống điều khiển");
        list.add("Các thiết bị an toàn");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}