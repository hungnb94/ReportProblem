package example.com.hb.reportproblem.model.utility;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/10/2018.
 */

public class BoilerArea implements INode, ISimpleNode {
//    Boiler 1
//    Boiler 2
//    Feed water tank
//    DO supply
//    Valves piping system
//    Economizer 1
//    Economizer 2
//    Control and electric system for boiler 1
//    Control and electric system for boiler 2

    Boiler1 boiler1;
    Boiler2 boiler2;
    FeedWaterTank feedWaterTank;
    DOSupply doSupply;
    ValvesPipingSystem valvesPipingSystem;
    Economizer1 economizer1;
    Economizer2 economizer2;
    ControlElectricBoiler1 controlElectricBoiler1;
    ControlElectricBoiler2 controlElectricBoiler2;

    @Override
    public String getName() {
        return "Boiler area";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add(boiler1.getName());
        list.add(boiler2.getName());
        list.add(feedWaterTank.getName());
        list.add(doSupply.getName());
        list.add(valvesPipingSystem.getName());
        list.add(economizer1.getName());
        list.add(economizer2.getName());
        list.add(controlElectricBoiler1.getName());
        list.add(controlElectricBoiler2.getName());
        return list;
    }

    public class Boiler1 implements ISimpleNode{
        @Override
        public String getName() {
            return "Boiler 1";
        }
    }

    public class Boiler2 implements ISimpleNode {
        @Override
        public String getName() {
            return "Boiler 2";
        }
    }

    public class FeedWaterTank implements ISimpleNode{
        @Override
        public String getName() {
            return "Feed water tank";
        }
    }

    public class DOSupply implements ISimpleNode{
        @Override
        public String getName() {
            return "DO supply";
        }
    }

    public class ValvesPipingSystem implements ISimpleNode{
        @Override
        public String getName() {
            return "Valves piping system";
        }
    }

    public class Economizer1 implements ISimpleNode{
        @Override
        public String getName() {
            return "Economizer 1";
        }
    }

    public class Economizer2 implements ISimpleNode{
        @Override
        public String getName() {
            return "Economizer 2";
        }
    }

    public class ControlElectricBoiler1 implements ISimpleNode{
        @Override
        public String getName() {
            return "ResourceBundle.Control and electric system for boiler 1";
        }
    }

    public class ControlElectricBoiler2 implements ISimpleNode{
        @Override
        public String getName() {
            return "ResourceBundle.Control and electric system for boiler 2";
        }
    }
}
