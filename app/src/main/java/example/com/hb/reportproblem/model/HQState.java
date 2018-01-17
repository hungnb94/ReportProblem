package example.com.hb.reportproblem.model;

import java.util.ArrayList;

/**
 * Created by hung on 1/15/2018.
 */

public class HQState implements INode, ISimpleNode{
    public static final String HQ_CAO = "HQ cao";
    public static final String HQ_THAP = "HQ thấp";

    @Override
    public String getName() {
        return "HQ";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add(HQ_CAO);
        list.add(HQ_THAP);
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}
