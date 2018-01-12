package example.com.hb.reportproblem.model;

import java.util.ArrayList;

/**
 * Created by HP ProBook on 1/10/2018.
 */

public interface INode {
    public ArrayList<String> getList();

    public ArrayList<INode> getChilds();
}
