package example.com.hb.reportproblem.model;

import java.util.ArrayList;

/**
 * Created by HP ProBook on 1/10/2018.
 */

public class Logistic implements INode, ISimpleNode {

    @Override
    public String getName() {
        return "Logistic";
    }

    @Override
    public ArrayList<String> getList() {
        return null;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}
