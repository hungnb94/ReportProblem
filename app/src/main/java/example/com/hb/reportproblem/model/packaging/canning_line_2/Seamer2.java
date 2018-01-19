package example.com.hb.reportproblem.model.packaging.canning_line_2;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class Seamer2 implements INode, ISimpleNode {
//    Seamer-2
//    CO2 system
//    Seaming rolls and seaming trucks
//    Lid stopper
//    Outfeed starwheel
//    Safety divices

    @Override
    public String getName() {
        return "Seamer-2";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Seamer-2");
        list.add("CO2 system");
        list.add("Seaming rolls and seaming trucks");
        list.add("Lid stopper");
        list.add("Outfeed starwheel");
        list.add("Safety divices");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}
