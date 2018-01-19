package example.com.hb.reportproblem.model.brewing;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/9/2018.
 */

public class Brewing implements INode, ISimpleNode {
    Brewhouse brewhouse = new Brewhouse();
    Cellar cellar = new Cellar();
    Filltration filltration = new Filltration();
    CIPAndService cipAndService = new CIPAndService();

    @Override
    public String getName() {
        return "Brewing";
    }

    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList();
        list.add(brewhouse.getName());
        list.add(cellar.getName());
        list.add(filltration.getName());
        list.add(cipAndService.getName());
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        ArrayList<INode> list = new ArrayList();
        list.add(brewhouse);
        list.add(cellar);
        list.add(filltration);
        list.add(cipAndService);
        return list;
    }
}
