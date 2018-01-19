package example.com.hb.reportproblem.model.packaging;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;
import example.com.hb.reportproblem.model.packaging.bottling_line.BottlingLine;
import example.com.hb.reportproblem.model.packaging.canning_line_2.CanningLine2;
import example.com.hb.reportproblem.model.packaging.kegging_line.KeggingLine;

/**
 * Created by HP ProBook on 1/9/2018.
 */

public class Packaging implements INode, ISimpleNode {
    BottlingLine bottlingLine = new BottlingLine();
    KeggingLine keggingLine = new KeggingLine();
    CanningLine2 canningLine2 = new CanningLine2();
    OtherPKG otherPKG = new OtherPKG();

    @Override
    public String getName() {
        return "Packaging";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList();
        list.add(bottlingLine.getName());
        list.add(keggingLine.getName());
        list.add(canningLine2.getName());
        list.add(otherPKG.getName());
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        ArrayList<INode> list = new ArrayList();
        list.add(bottlingLine);
        list.add(keggingLine);
        list.add(canningLine2);
        list.add(otherPKG);
        return list;
    }
}
