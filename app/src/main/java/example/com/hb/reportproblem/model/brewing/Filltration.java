package example.com.hb.reportproblem.model.brewing;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/9/2018.
 */

public class Filltration implements INode, ISimpleNode {
    FATank faTank;
    BagSlitting bagSlitting;
    UBTAndPVPP ubtAndPVPP;
    KGF kgf;
    FBTAndBlending fbtAndBlending;
    BBT bbt;
    MatureBeerLine matureBeerLine;
    TransferBeerLine transferBeerLine;

    @Override
    public String getName() {
        return "Filltration";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList();
        list.add(faTank.getName());
        list.add(bagSlitting.getName());
        list.add(ubtAndPVPP.getName());
        list.add(kgf.getName());
        list.add(fbtAndBlending.getName());
        list.add(bbt.getName());
        list.add(matureBeerLine.getName());
        list.add(transferBeerLine.getName());
        return list;
    }

    public class FATank implements ISimpleNode {
        @Override
        public String getName() {
            return "FA tank";
        }
    }

    public class BagSlitting implements ISimpleNode {
        @Override
        public String getName() {
            return "Bag slitting";
        }
    }

    public class UBTAndPVPP implements ISimpleNode {
        @Override
        public String getName() {
            return "UBT & PVPP";
        }
    }

    public class KGF implements ISimpleNode {
        @Override
        public String getName() {
            return "KGF";
        }
    }

    public class FBTAndBlending implements ISimpleNode {
        @Override
        public String getName() {
            return "FBT & Blending";
        }
    }

    public class BBT implements ISimpleNode {
        @Override
        public String getName() {
            return "BBT";
        }
    }

    public class MatureBeerLine implements ISimpleNode {
        @Override
        public String getName() {
            return "Mature beer line";
        }
    }

    public class TransferBeerLine implements ISimpleNode {
        @Override
        public String getName() {
            return "Transfer beer line";
        }
    }
}
