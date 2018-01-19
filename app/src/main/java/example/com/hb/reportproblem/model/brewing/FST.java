package example.com.hb.reportproblem.model.brewing;

import java.util.ArrayList;

import example.com.hb.reportproblem.model.INode;
import example.com.hb.reportproblem.model.ISimpleNode;

/**
 * Created by hung on 1/19/2018.
 */

public class FST implements INode, ISimpleNode {
//    FST
//    FST 211
//    FST 212
//    FST 213
//    FST 221
//    FST 222
//    FST 223
//    FST 231
//    FST 232
//    FST 233
//    FST 241
//    FST 242
//    FST 243
//    FST 251
//    FST 252
//    FST 253
//    FST 261
//    FST 262
//    FST 263
//    FST 411
//    FST 412
//    FST 413
//    FST 421
//    FST 422
//    FST 423
//    FST 431
//    FST 432
//    FST 433

    @Override
    public String getName() {
        return "FST";
    }

    @Override
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("FST");
        list.add("FST 211");
        list.add("FST 212");
        list.add("FST 213");
        list.add("FST 221");
        list.add("FST 222");
        list.add("FST 223");
        list.add("FST 231");
        list.add("FST 232");
        list.add("FST 233");
        list.add("FST 241");
        list.add("FST 242");
        list.add("FST 243");
        list.add("FST 251");
        list.add("FST 252");
        list.add("FST 253");
        list.add("FST 261");
        list.add("FST 262");
        list.add("FST 263");
        list.add("FST 411");
        list.add("FST 412");
        list.add("FST 413");
        list.add("FST 421");
        list.add("FST 422");
        list.add("FST 423");
        list.add("FST 431");
        list.add("FST 432");
        list.add("FST 433");
        return list;
    }

    @Override
    public ArrayList<INode> getChilds() {
        return null;
    }
}