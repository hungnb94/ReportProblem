package example.com.hb.reportproblem.model.brewing;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/12/2018.
 */

public class IntakePit implements INode, ISimpleNode {
//    Intake pit
//    Intake pit malt
//    Intake pit rice
//    Dust filter to bins

    @Override
    public String getName() {
        return "Intake pit";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Intake pit");
        list.add("Intake pit malt");
        list.add("Intake pit rice");
        list.add("Dust filter to bins");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }

}
