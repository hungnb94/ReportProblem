package example.com.hb.reportproblem.model.brewing;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class MashFilter implements INode, ISimpleNode {
//    Mash filter
//    Sparge water tank
//    Mash filter CIP plant
//    Spent grains hopper
//    Spent grains silo

    @Override
    public String getName() {
        return "Mash filter";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mash filter");
        list.add("Sparge water tank");
        list.add("Mash filter CIP plant");
        list.add("Spent grains hopper");
        list.add("Spent grains silo");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}

