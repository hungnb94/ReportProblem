package example.com.hb.reportproblem.model.brewing;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by HP ProBook on 1/9/2018.
 */

public class Filltration implements INode, ISimpleNode {
    FATank faTank = new FATank();
    BagSlitting bagSlitting = new BagSlitting();
    UBTAndPVPP ubtAndPVPP = new UBTAndPVPP();
    KGF kgf = new KGF();
    FBTAndBlending fbtAndBlending = new FBTAndBlending();
    BBT bbt = new BBT();
    MatureBeerLine matureBeerLine = new MatureBeerLine();
    TransferBeerLine transferBeerLine = new TransferBeerLine();

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

    @Override
    public ArrayList<INode> getChilds() {
        ArrayList<INode> list = new ArrayList();
        list.add(faTank);
        list.add(bagSlitting);
        list.add(ubtAndPVPP);
        list.add(kgf);
        list.add(fbtAndBlending);
        list.add(bbt);
        list.add(matureBeerLine);
        list.add(transferBeerLine);
        return list;
    }

    public class FATank implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "FA tank";
        }

        @Override
        public ArrayList<String> getList() {
            return null;
        }

        @Override
        public ArrayList<INode> getChilds() {
            return null;
        }
    }

    public class BagSlitting implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Bag slitting";
        }

        @Override
        public ArrayList<String> getList() {
            return null;
        }

        @Override
        public ArrayList<INode> getChilds() {
            return null;
        }
    }

    public class UBTAndPVPP implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "UBT & PVPP";
        }

        @Override
        public ArrayList<String> getList() {
            return null;
        }

        @Override
        public ArrayList<INode> getChilds() {
            return null;
        }
    }

    public class KGF implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "KGF";
        }

        @Override
        public ArrayList<String> getList() {
            return null;
        }

        @Override
        public ArrayList<INode> getChilds() {
            return null;
        }
    }

    public class FBTAndBlending implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "FBT & Blending";
        }

        @Override
        public ArrayList<String> getList() {
            return null;
        }

        @Override
        public ArrayList<INode> getChilds() {
            return null;
        }
    }

    public class BBT implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "BBT";
        }

        @Override
        public ArrayList<String> getList() {
            return null;
        }

        @Override
        public ArrayList<INode> getChilds() {
            return null;
        }
    }

    public class MatureBeerLine implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Mature beer line";
        }

        @Override
        public ArrayList<String> getList() {
            return null;
        }

        @Override
        public ArrayList<INode> getChilds() {
            return null;
        }
    }

    public class TransferBeerLine implements INode, ISimpleNode {
        @Override
        public String getName() {
            return "Transfer beer line";
        }

        @Override
        public ArrayList<String> getList() {
            return null;
        }

        @Override
        public ArrayList<INode> getChilds() {
            return null;
        }
    }
}
