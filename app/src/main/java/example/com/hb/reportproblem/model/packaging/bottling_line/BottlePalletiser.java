package example.com.hb.reportproblem.model.packaging.bottling_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class BottlePalletiser implements INode, ISimpleNode {
//    Bottle Palletiser
//    Băng tải roller đầu vào
//    Robot nâng hạ crate & Bàn ra/vào crate
//    Hệ thống sensor trung tâm bàn ra/vào crate
//    Băng tải ra /vào pallet/Pallet magazine
//    Băng tải ra /vào crates
//    Hệ thống cửa an toàn xung quanh máy
//    Cụm băng tải con lăn và xoay crate
//    Cụm băng tải crate đầu ra
//    Hệ thống khí nén
//    Hệ thống điện và điều khiển

    @Override
    public String getName() {
        return "Bottle Palletiser";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bottle Palletiser");
        list.add("Băng tải roller đầu vào");
        list.add("Robot nâng hạ crate & Bàn ra/vào crate");
        list.add("Hệ thống sensor trung tâm bàn ra/vào crate");
        list.add("Băng tải ra /vào pallet/Pallet magazine");
        list.add("Băng tải ra /vào crates");
        list.add("Hệ thống cửa an toàn xung quanh máy");
        list.add("Cụm băng tải con lăn và xoay crate");
        list.add("Cụm băng tải crate đầu ra");
        list.add("Hệ thống khí nén");
        list.add("Hệ thống điện và điều khiển");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}