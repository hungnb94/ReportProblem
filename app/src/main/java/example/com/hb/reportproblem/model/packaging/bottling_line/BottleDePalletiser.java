package example.com.hb.reportproblem.model.packaging.bottling_line;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class BottleDePalletiser implements INode, ISimpleNode {
//    Bottle De-palletiser
//    Băng tải crate đầu vào
//    Robot nâng hạ crate & Bàn ra/vào crate
//    Hệ thống sensor trung tâm bàn ra/vào crate
//    Băng tải ra /vào pallets/Pallet magazine
//    Băng tải ra /vào crates
//    Hệ thống cửa an toàn xung quanh máy
//    Hệ thống khí nén
//    Hệ thống băng tải roller
//    Cụm băng tải xoay crate
//    Hệ thống điện và điều khiển

    @Override
    public String getName() {
        return "Bottle De-palletiser";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bottle De-palletiser");
        list.add("Băng tải crate đầu vào");
        list.add("Robot nâng hạ crate & Bàn ra/vào crate");
        list.add("Hệ thống sensor trung tâm bàn ra/vào crate");
        list.add("Băng tải ra /vào pallets/Pallet magazine");
        list.add("Băng tải ra /vào crates");
        list.add("Hệ thống cửa an toàn xung quanh máy");
        list.add("Hệ thống khí nén");
        list.add("Hệ thống băng tải roller");
        list.add("Cụm băng tải xoay crate");
        list.add("Hệ thống điện và điều khiển");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}