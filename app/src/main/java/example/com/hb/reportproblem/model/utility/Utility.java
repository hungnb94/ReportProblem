package example.com.hb.reportproblem.model.utility;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/9/2018.
 */

public class Utility implements INode, ISimpleNode {
    BoilerArea boilerArea = new BoilerArea();
    CO2Area co2Area = new CO2Area();
    AirPlant airPlant = new AirPlant();
    CoolingArea coolingArea = new CoolingArea();
    WTPArea wtpArea = new WTPArea();
    WWTPArea wwtpArea = new WWTPArea();
    GenerationArea generationArea = new GenerationArea();

    public String getName() {
        return "Utility";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList();
        list.add(boilerArea.getName());
        list.add(co2Area.getName());
        list.add(airPlant.getName());
        list.add(coolingArea.getName());
        list.add(wtpArea.getName());
        list.add(wwtpArea.getName());
        list.add(generationArea.getName());
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        ArrayList<INode> list = new ArrayList();
        list.add(boilerArea);
        list.add(co2Area);
        list.add(airPlant);
        list.add(coolingArea);
        list.add(wtpArea);
        list.add(wwtpArea);
        list.add(generationArea);
        return list;
    }
}
