package example.com.hb.reportproblem.model.packaging.canning_line_2;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class CanFillerGroup2 implements INode, ISimpleNode {
//    Can Filler Machine Group-2
//    Infeed worm, star wheel and pre-lushing system
//    Ring tank, filler base
//    Filling valves
//    Buffer tank, valves and pumps
//    Cabinet control and instrument divice (TT, PT, FL, CT…)
//    CO2 system
//    Air compressure system
//    Safety divices

    @Override
    public String getName() {
        return "Can Filler Group-2";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Can Filler Machine Group-2");
        list.add("Infeed worm, star wheel and pre-lushing system");
        list.add("Ring tank, filler base");
        list.add("Filling valves");
        list.add("Buffer tank, valves and pumps");
        list.add("Cabinet control and instrument divice (TT, PT, FL, CT…)");
        list.add("CO2 system");
        list.add("Air compressure system");
        list.add("Safety divices");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}