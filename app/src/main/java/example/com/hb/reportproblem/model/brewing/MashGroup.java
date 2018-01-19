package example.com.hb.reportproblem.model.brewing;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class MashGroup implements INode, ISimpleNode {
//    Mash group
//    Mashing in
//    Mash vessel 1
//    Mash vessel 2

    @Override
    public String getName() {
        return "Mash group";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mash group");
        list.add("Mashing in");
        list.add("Mash vessel 1");
        list.add("Mash vessel 2");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}

