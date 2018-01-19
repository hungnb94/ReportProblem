package example.com.hb.reportproblem.model.packaging.canning_line_2;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class CanEmptyConveyorGroup2 implements INode, ISimpleNode {
//    Can Empty Conveyor Group-2
//    Hệ thống băng tải
//    Động cơ, hộp số
//    Hệ thống điều khiển và thiết bị điện

    @Override
    public String getName() {
        return "Can Empty Conveyor Group-2";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Can Empty Conveyor Group-2");
        list.add("Hệ thống băng tải");
        list.add("Động cơ, hộp số");
        list.add("Hệ thống điều khiển và thiết bị điện");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}