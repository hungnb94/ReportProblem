package example.com.hb.reportproblem.model.brewing;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class MillingRoom implements INode, ISimpleNode {
//    Product out dust filter intake
//    Milling room
//    Weigh bin malt
//    Weigh bin rice
//    Motor outlet conveyor malt/rice bin
//    Elevator to malt/rice cleaning
//    Malt cleaning and milling
//    Rice cleaning and milling
//    Raw materials general service
//    Spark detector
//    Grist bin - rice
//    Grist bin - malt
//    Grist transfer

    @Override
    public String getName() {
        return "Milling room";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Product out dust filter intake");
        list.add("Milling room");
        list.add("Weigh bin malt");
        list.add("Weigh bin rice");
        list.add("Motor outlet conveyor malt/rice bin");
        list.add("Elevator to malt/rice cleaning");
        list.add("Malt cleaning and milling");
        list.add("Rice cleaning and milling");
        list.add("Raw materials general service");
        list.add("Spark detector");
        list.add("Grist bin - rice");
        list.add("Grist bin - malt");
        list.add("Grist transfer");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}
