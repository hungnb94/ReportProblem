package example.com.hb.reportproblem.model.brewing;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/12/2018.
 */

public class MaltStore implements INode, ISimpleNode {

    @Override
    public String getName() {
        return "Malt store";
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
