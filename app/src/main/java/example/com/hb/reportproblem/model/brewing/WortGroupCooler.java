package example.com.hb.reportproblem.model.brewing;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class WortGroupCooler implements INode, ISimpleNode {
//    Wort group & cooler
//    Holding vessel
//    Wort copper
//    Whirlpool
//    Wort cooler
//    Trub tank
//    Wort pre-heat
//    Energy storage tank

    @Override
    public String getName() {
        return "Wort group & cooler";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Wort group & cooler");
        list.add("Holding vessel");
        list.add("Wort copper");
        list.add("Whirlpool");
        list.add("Wort cooler");
        list.add("Trub tank");
        list.add("Wort pre-heat");
        list.add("Energy storage tank");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}