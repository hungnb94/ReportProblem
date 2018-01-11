package example.com.hb.reportproblem.model.packaging;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/10/2018.
 */

public class OtherPKG implements INode, ISimpleNode {
    @Override
    public String getName() {
        return "Other PKG";
    }

    @Override
    public ArrayList<String> getList() {
        return null;
    }
}
