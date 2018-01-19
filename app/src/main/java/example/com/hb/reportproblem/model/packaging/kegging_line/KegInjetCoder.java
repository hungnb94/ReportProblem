package example.com.hb.reportproblem.model.packaging.kegging_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class KegInjetCoder implements INode, ISimpleNode {
//    Keg - Injet Coder
//    Đầu phun mực
//    Tủ điều khiển

    @Override
    public String getName() {
        return "Keg - Injet Coder";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Keg - Injet Coder");
        list.add("Đầu phun mực");
        list.add("Tủ điều khiển");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}