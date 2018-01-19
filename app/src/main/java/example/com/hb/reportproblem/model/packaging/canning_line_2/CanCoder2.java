package example.com.hb.reportproblem.model.packaging.canning_line_2;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class CanCoder2 implements INode, ISimpleNode {
//    Can Coder-2
//    Hệ thống đầu in
//    Hệ thống khí nén
//    Hệ thống mực và dung môi
//    Hệ thống điều khiển và thiết bị điện

    @Override
    public String getName() {
        return "Can Coder-2";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Can Coder-2");
        list.add("Hệ thống đầu in");
        list.add("Hệ thống khí nén");
        list.add("Hệ thống mực và dung môi");
        list.add("Hệ thống điều khiển và thiết bị điện");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}