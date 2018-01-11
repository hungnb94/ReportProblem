package example.com.hb.reportproblem.model;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.brewing.Brewhouse;
import example.com.hb.reportproblem.model.brewing.CIPAndService;
import example.com.hb.reportproblem.model.brewing.Cellar;
import example.com.hb.reportproblem.model.brewing.Filltration;

/**
 * Created by HP ProBook on 1/9/2018.
 */

public class Brewing implements INode,ISimpleNode {
    Brewhouse brewhouse;
    Cellar cellar;
    Filltration filltration;
    CIPAndService cipAndService;

    @Override
    public String getName() {
        return "Brewing";
    }

    public ArrayList<String> getList(){
        ArrayList<String> list = new ArrayList();
        list.add(brewhouse.getName());
        list.add(cellar.getName());
        list.add(filltration.getName());
        list.add(cipAndService.getName());
        return list;
    }
}
